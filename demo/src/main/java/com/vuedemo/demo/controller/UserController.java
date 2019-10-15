package com.vuedemo.demo.controller;

import com.vuedemo.demo.common.CommonResult;
import com.vuedemo.demo.dto.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RequestMapping("/api")
@RestController
public class UserController {

    @Autowired
    HttpServletRequest request;

    @GetMapping("/user/info")
    public CommonResult userInfo(String token) {
        String token1 = request.getHeader("X-Token");

        HashMap<String, String> userInfo = new HashMap<>();
        userInfo.put("name", "zhanghongxu");
        userInfo.put("avatar", "https://avatar-static.segmentfault.com/285/486/285486960-59226f974c266_big64");
        userInfo.put("token", token);
        userInfo.put("token1", token1);

        return CommonResult.success(userInfo);
    }

    @PostMapping("/user/login")
    public CommonResult login(@RequestBody LoginParam loginParam) {
        HashMap<String, String> tokenMap = new HashMap<>();
        tokenMap.put("username", loginParam.getPassword());
        tokenMap.put("password", loginParam.getUsername());
        tokenMap.put("token", "xxxxxx");

        return CommonResult.success(tokenMap);
    }

//    public CommonResult logout() {
//
//    }
}
