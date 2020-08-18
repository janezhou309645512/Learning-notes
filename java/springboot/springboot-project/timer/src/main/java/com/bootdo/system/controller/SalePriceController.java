package com.bootdo.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authc.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.common.annotation.Log;
import com.bootdo.common.utils.R;
import com.bootdo.system.domain.OutPutValueDO;
import com.bootdo.system.domain.OutputValueJobDO;
import com.bootdo.system.domain.SalePriceDO;
import com.bootdo.system.service.SalePriceService;

@Controller
public class SalePriceController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SalePriceService downService;

    @Log("查询销售单价表")
    @PostMapping("/salePriceview")
    @ResponseBody
    R salePriceview(@Param("starttime1") String starttime1, @Param("endtime1") String endtime1, @Param("starttime2") String starttime2, @Param("endtime2") String endtime2, @Param("xdlist") String xdlist, @Param("zz") String zz, @Param("flag") String flag, @Param("khmc") String khmc, @Param("xszz") String xszz, @Param("wlbm") String wlbm) {

        try {
            Map<String, Object> map = new HashMap<>();
//			map.put("gdbh", gdbh);
            map.put("flag", flag);
            map.put("starttime1", starttime1);
            map.put("endtime1", endtime1);
            map.put("starttime2", starttime2);
            map.put("endtime2", endtime2);
            map.put("xszz", xszz);
            map.put("khmc", khmc);
            map.put("wlbm", wlbm);
            if (xdlist != "" && xdlist != null) {
                String[] dos = xdlist.split("@");
                map.put("xdlist", dos);
            }

            if (zz != "" && zz != null) {
                String[] dos = zz.split("@");
                map.put("zzfws", dos);
            }

            List<SalePriceDO> gs = downService.salePriceView(map);
            Map<String, Object> maps = new HashMap<>();
            maps.put("data", gs);
            return R.ok(maps);
        } catch (AuthenticationException e) {
            return R.error("查询失败");
        }
    }

    @Log("查询冲压销售单价表")
    @PostMapping("/punchingSalePriceview")
    @ResponseBody
    R punchingSalePriceview(@Param("starttime1") String starttime1, @Param("endtime1") String endtime1, @Param("starttime2") String starttime2, @Param("endtime2") String endtime2, @Param("xdlist") String xdlist, @Param("flag") String flag, @Param("khmc") String khmc, @Param("xszz") String xszz) {

        try {
            Map<String, Object> map = new HashMap<>();
//			map.put("gdbh", gdbh);
            map.put("flag", flag);
            map.put("starttime1", starttime1);
            map.put("endtime1", endtime1);
            map.put("starttime2", starttime2);
            map.put("endtime2", endtime2);
            map.put("xszz", xszz);
            map.put("khmc", khmc);
            if (xdlist != "" && xdlist != null) {
                String[] dos = xdlist.split("@");
                map.put("xdlist", dos);
            }
            List<SalePriceDO> gs = downService.punchingSalePriceView(map);
            Map<String, Object> maps = new HashMap<>();
            maps.put("data", gs);
            return R.ok(maps);
        } catch (AuthenticationException e) {
            return R.error("查询失败");
        }
    }


    @Log("查询模切销售出库流水表")
    @PostMapping("/dieCutCrossWiringSalePriceview")
    @ResponseBody
    R dieCutCrossWiringSalePriceview(@Param("starttime") String starttime, @Param("endtime") String endtime, @Param("xdlist") String xdlist, @Param("xszz") String xszz) {

        try {
            Map<String, Object> map = new HashMap<>();
//			map.put("gdbh", gdbh);
            map.put("starttime", starttime);
            map.put("endtime", endtime);
            map.put("xszz", xszz);
            if (xdlist != "" && xdlist != null) {
                String[] dos = xdlist.split("@");
                map.put("xdlist", dos);
            }
            List<SalePriceDO> gs = downService.dieCutCrossWiringSalePriceview(map);
            Map<String, Object> maps = new HashMap<>();
            maps.put("data", gs);
            return R.ok(maps);
        } catch (AuthenticationException e) {
            return R.error("查询失败");
        }
    }

    @Log("查询产值表")
    @PostMapping("/outPutView")
    @ResponseBody
    R outPutView(@Param("starttime") String starttime, @Param("endtime") String endtime, @Param("bmfws") String bmfws, @Param("zz") String zz, @Param("flag") String flag, @Param("srcnumber") String srcnumber, @Param("materialNumber") String materialNumber) {

        try {
            Map<String, Object> map = new HashMap<>();
            map.put("starttime", starttime);
            map.put("endtime", endtime);
            map.put("flag", flag);
            map.put("srcnumber", srcnumber);
            map.put("materialNumber", materialNumber);
//			
            if (zz != "" && zz != null) {
                String[] dos = zz.split("@");
                map.put("zzfws", dos);
            }
            if (bmfws != "" && bmfws != null) {
                String[] dos = bmfws.split("@");
                map.put("bmfws", dos);
            }


            List<OutPutValueDO> gs = downService.outPutView(map);
            Map<String, Object> maps = new HashMap<>();
            maps.put("data", gs);
            return R.ok(maps);
        } catch (AuthenticationException e) {
            return R.error("查询失败");
        }
    }


    @Log("查询待同步产值表")
    @PostMapping("/outPutJobView")
    @ResponseBody
    R outPutJobView(@Param("starttime") String starttime, @Param("endtime") String endtime) {

        try {
            Map<String, Object> map = new HashMap<>();
            map.put("starttime", starttime);
            map.put("endtime", endtime);

            List<OutputValueJobDO> gs = downService.outPutJob(map);
            Map<String, Object> maps = new HashMap<>();
            maps.put("data", gs);
            return R.ok(maps);
        } catch (AuthenticationException e) {
            return R.error("查询失败");
        }
    }

}
