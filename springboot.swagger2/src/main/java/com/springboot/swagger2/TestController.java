package com.springboot.swagger2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaijunfeng
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(name = "/test", method = {RequestMethod.GET})
    public String test() {
        return "test";
    }
}
