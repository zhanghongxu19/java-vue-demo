package com.vuedemo.demo.controller;

import com.vuedemo.demo.common.CommonResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestController {

    @PostMapping("/uploadOne")
    public CommonResult uploadOne(@RequestParam(name="uploadOne", required = false) MultipartFile file) {
        if (file == null) {
            return CommonResult.failed("请选择图片");
        }
        if (!file.isEmpty()) {
            return CommonResult.success("上传成功");
        }
        return CommonResult.failed("上传失败");
    }

    @PostMapping("/upload/request")
    public CommonResult uploadRequest(HttpServletRequest request) {

        boolean flag = false;

        MultipartHttpServletRequest mreq = null;
        if (request instanceof  MultipartHttpServletRequest) {
            mreq = (MultipartHttpServletRequest)request;
        } else {
            return CommonResult.failed("上传失败");
        }
        MultipartFile mf = mreq.getFile("uploadOne");
        String name = mf.getOriginalFilename();
        File file = new File(name);
        try {
            mf.transferTo(file);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed("上传失败");
        }
        return CommonResult.success("上传成功");
    }
}
