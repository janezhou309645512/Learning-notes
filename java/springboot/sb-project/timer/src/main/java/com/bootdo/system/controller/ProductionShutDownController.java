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
import com.bootdo.system.domain.ProductionShutDownDO;
import com.bootdo.system.service.ProductionShutDownService;

@Controller
public class ProductionShutDownController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ProductionShutDownService downService;

    @Log("查询生产关闭时间表")
    @PostMapping("/productionShutDownview")
    @ResponseBody
    R productionShutDownview(@Param("gdbh") String gdbh, @Param("wlbm") String wlbm, @Param("starttime") String starttime, @Param("endtime") String endtime, @Param("gdbhs") String gdbhs, @Param("gltj") String gltj, @Param("zz") String zz, @Param("zzbms") String zzbms) {

        try {
//			List<ProductionShutDownDO> dos = 
            Map<String, Object> map = new HashMap<>();
            map.put("gdbh", gdbh);
            map.put("gltj", gltj);
            map.put("wlbm", wlbm);
            map.put("starttime", starttime);
            map.put("endtime", endtime);
            if (gdbhs != "" && gdbhs != null) {
                map.put("gdbhs", gdbhs);
            }
            if (zz != "" && zz != null) {
                String[] dos = zz.split("@");
                map.put("zzfws", dos);
            }
            if (zzbms != "" && zzbms != null) {
                String[] dos = zzbms.split("@");
                map.put("zzbms", dos);
            }
            List<ProductionShutDownDO> gs = downService.productionShutDownView(map);
            Map<String, Object> maps = new HashMap<>();
            maps.put("data", gs);
            return R.ok(maps);
        } catch (AuthenticationException e) {
            return R.error("查询失败");
        }
    }


}
