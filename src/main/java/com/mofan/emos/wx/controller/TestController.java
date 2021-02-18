package com.mofan.emos.wx.controller;

import com.mofan.emos.wx.common.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mofan
 * @date 2021/2/18 21:57
 */
@RestController
@RequestMapping("/test")
@Api("测试web接口")
public class TestController {
    @GetMapping("/sayHello")
    @ApiOperation("最简单的测试方法")
    public R sayHello(){
        return R.ok().put("message","HelloWorld");
    }
}
