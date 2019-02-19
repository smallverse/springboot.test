package com.springboot.swagger2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaijunfeng
 */
@RestController
@Api(value = "测试", description = "测试 RestController")
@RequestMapping("/test")
public class TestController {
    @ApiOperation(value = "测试", notes = "notes 测试")
    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public String test() {
        return "test";
    }

    @ApiOperation(value = "获取用户列表", notes = "notes 获取用户列表")
    @RequestMapping(value = "/getInfo", method = RequestMethod.POST)
    public String getInfo(@RequestParam(value = "输入参数") String strInput) {
        return "getInfo" + strInput;
    }

}
