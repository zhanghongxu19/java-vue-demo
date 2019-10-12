package com.vuedemo.demo.controller;

import com.vuedemo.demo.common.Result;
import com.vuedemo.demo.dto.LoginParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HellowordController {

    @PostMapping("/login")
    public Result test(@RequestBody LoginParam loginParam)
    {
        HashMap<String, String> tokenMap = new HashMap<>();
        tokenMap.put("username", loginParam.getPassword());
        tokenMap.put("password", loginParam.getUsername());

        return Result.success(tokenMap);
    }
}
