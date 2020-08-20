package com.bootdo.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authc.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.common.annotation.Log;
import com.bootdo.common.utils.R;
import com.bootdo.system.domain.PunchingOutsourceDO;
import com.bootdo.system.domain.PurchasePriceDO;
import com.bootdo.system.service.PunchingOutsourceService;
import com.bootdo.system.service.PurchasePriceService;

@Controller
@RequestMapping("/punching")
public class PunchingOutsourceController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PunchingOutsourceService punchingOutsourceService;

    @Log("查询冲压委外外协加工中间表")
    @PostMapping("/list")
    @ResponseBody
    R list(@Param("zz") String zz) {
        try {
            Map<String, Object> map = new HashMap<>();
            if (zz != "" && zz != null) {
                String[] dos = zz.split("@");
                map.put("zzfws", dos);
            }
            List<PunchingOutsourceDO> gs = punchingOutsourceService.list(map);
            Map<String, Object> maps = new HashMap<>();
            maps.put("data", gs);
            return R.ok(maps);
        } catch (AuthenticationException e) {
            return R.error("查询失败");
        }
    }

}
