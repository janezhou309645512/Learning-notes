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
import com.bootdo.system.domain.GrossSalesDO;
import com.bootdo.system.service.GrossSalesService;

@Controller
public class GrossSalesController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GrossSalesService grossSalesService;

    @Log("查询销售毛利表")
    @PostMapping("/grosssalesview")
    @ResponseBody
    R grosssalesview(@Param("starttime") String starttime, @Param("endtime") String endtime, @Param("zzfws") String zzfws, @Param("page") String page, @Param("limit") String limit) {

        try {
            Map<String, Object> map = new HashMap<>();
            map.put("starttime", starttime);
            map.put("endtime", endtime);
            map.put("page", page);
            map.put("limit", limit);
            if (zzfws != "" && zzfws != null) {
                String[] dos = zzfws.split("@");
                map.put("zzfws", dos);
            }
            List<GrossSalesDO> gs = grossSalesService.grossSaleView(map);
            Map<String, Object> maps = new HashMap<>();
            maps.put("data", gs);
            return R.ok(maps);
        } catch (AuthenticationException e) {
            return R.error("查询失败");
        }
    }


    @Log("查询销售毛利表条数")
    @PostMapping("/grosssalesviewcount")
    @ResponseBody
    R grosssalesviewcount(@Param("starttime") String starttime, @Param("endtime") String endtime, @Param("zzfws") String zzfws) {

        try {
            Map<String, Object> map = new HashMap<>();
            map.put("starttime", starttime);
            map.put("endtime", endtime);
            if (zzfws != "" && zzfws != null) {
                String[] dos = zzfws.split("@");
                map.put("zzfws", dos);
            }
            int count = grossSalesService.grossSaleViewCount(map);
            Map<String, Object> maps = new HashMap<>();
            maps.put("count", count);
            return R.ok(maps);
        } catch (AuthenticationException e) {
            return R.error("查询失败");
        }
    }

}
