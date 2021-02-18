package com.mofan.emos.wx.controller;

import com.mofan.emos.wx.common.util.R;
import com.mofan.emos.wx.controller.form.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author mofan
 * @date 2021/2/18 21:57
 */
@RestController
@RequestMapping("/test")
@Api("测试web接口")
public class TestController {
    @PostMapping("/sayHello")
    @ApiOperation("最简单的测试方法")
    public R sayHello(@Valid @RequestBody TestSayHelloForm form) {
        return R.ok().put("message", "Hello," + form.getName());
    }
}
