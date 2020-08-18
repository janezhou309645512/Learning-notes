package com.bootdo.common.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.bootdo.common.config.BootdoConfig;
import com.bootdo.common.utils.DateUtils;
import com.bootdo.common.utils.HttpHelper;
import com.bootdo.system.domain.GrossSalesViewDO;
import com.bootdo.system.service.GrossSalesViewService;

@Component
public class WelcomeJob implements Job{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	SimpMessagingTemplate template;
	@Autowired
	GrossSalesViewService salesViewService;
	@Autowired
	BootdoConfig config;
    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
//    	template.convertAndSend("/topic/getResponse", new Response("欢迎体验bootdo,这是一个任务计划，使用了websocket和quzrtz技术，可以在计划列表中取消，欢迎您加入qq群交流学习!" ));
    	String now = DateUtils.format(new Date(), "yyyy-MM-dd");
    	Integer day = Integer.valueOf(DateUtils.getDayByToday());
    	Map<String,Object> map = new HashMap<>();
    	
        //每月7号零点同步上个月数据一次 标记删除上个月每天同步的数据
        if(7==day) {
        	map.put("starttime", DateUtils.getLastMonthFirstDay()+" 00:00:00");
            map.put("endtime", DateUtils.getLastMonthLastDay()+" 23:59:59");
        }else {
        	//每天同步一次
        	map.put("starttime", "2019-02-01 00:00:00");//now+" 00:00:00"
            map.put("endtime", "2019-02-28 23:59:59");//now+" 23:59:59"
        }
        List<GrossSalesViewDO> dos = salesViewService.list(map);
        if(dos.isEmpty()) {
        	if(7==day) {
        		//每月7号 标记删除上个月同步的数据
        		salesViewService.batchUpdate(dos);
        	}
        	
        	String param = HttpHelper.httpClientPost(config.getGrosssalespath(), map, "UTF-8");
        	JSONObject obj = JSONObject.parseObject(param);
        	if(obj.getInteger("code")==0 && obj.getJSONArray("data").size() > 0) {
            	logger.info("同步銷售毛利表数据开始");
            	List<GrossSalesViewDO> salesViewDOs = obj.getJSONArray("data").toJavaList(GrossSalesViewDO.class);
            	logger.info("待同步銷售毛利表数据有"+salesViewDOs.size()+"条");
            	boolean flag = salesViewService.syncDate(salesViewDOs);
            	logger.info("同步銷售毛利表数据结束，同步状态："+flag);
        	}else {
        		logger.info(obj.getString("同步失败或当天没有需要同步的数据"));
        	}
        }else {
        	logger.info("当天数据已同步！");
        }
    	
    	
    }

}