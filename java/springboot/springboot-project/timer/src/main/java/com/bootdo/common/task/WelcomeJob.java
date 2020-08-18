package com.bootdo.common.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bootdo.system.domain.ADUserDO;
import com.bootdo.system.domain.GrossSalesDO;
import com.bootdo.system.domain.UserDO;
import com.bootdo.system.service.GrossSalesService;
import com.bootdo.system.service.UserService;

@Component
@Configurable
@EnableScheduling
public class WelcomeJob {
    @Autowired
    UserService userService;
    @Autowired
    GrossSalesService grossSalesService;

    //每1分钟执行一次
//    @Scheduled(cron = "0 */1 *  * * * ")
//    public void userByCron(){
//        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + new Date ());
//        List<ADUserDO> adlist = userService.aduserlist(null);
//    	List<UserDO> usrdos = new ArrayList<UserDO>();
//    	for (ADUserDO adUserDO : adlist) {
//			UserDO userDO = new UserDO();
//			userDO.setUsername(adUserDO.getFusername());
//			userDO.setDeptName(adUserDO.getFdepartment());
//			userDO.setPassword(adUserDO.getFguid());
//			usrdos.add(userDO);
//		}
//    	int count = userService.batchSave(usrdos);
//    }

    //每1分钟执行一次
//    @Scheduled(cron = "0 */1 *  * * * ")
//    public void grossSalesReportCurrentByCron(){
//        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + new Date ());
//        Map<String,String> map = new HashMap<>();
//        map.put("starttime", "2019-03-11 23:59:59");
//        map.put("endtime", "2019-03-12 00:00:00");
//        map.put("companyname", "领胜电子科技(深圳)有限公司");
//        map.put("fcustomer", "2.2.0015");
//        map.put("billfnumer", "LSSZAR190300549");
//        map.put("fnumber", "800-KKM416-08-R");
//        List<GrossSalesDO> reportlist = grossSalesService.grossSaleView(map);
//        System.out.println(reportlist.size());
//    	int count = userService.batchSave(usrdos);
//    }

}