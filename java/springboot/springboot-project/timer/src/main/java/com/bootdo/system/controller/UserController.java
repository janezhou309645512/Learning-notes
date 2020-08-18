package com.bootdo.system.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.common.utils.R;
import com.bootdo.system.domain.UserDO;
import com.bootdo.system.service.UserService;

@RequestMapping("/sys/user")
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/qurryUserByNo")
    @ResponseBody
    R qurryUserByNo(@Param("userNo") String userNo) {
        UserDO userDo = userService.qurryUserByNo(userNo);
        if (userDo == null) {
            return R.error("没有此人相关信息，请前去维护!");
        } else {

            Map<String, Object> m = new HashMap<String, Object>();
            m.put("data", userDo);
            return R.ok(m);
        }

    }
}
