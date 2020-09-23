package com.haochang.center.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.haochang.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 描述：测试 controller
 * @author: youzhi.gao
 * @date: 2020-09-23 10:43
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference(group = "${dubbo.application.group}", version = "${dubbo.application.version}")
    private DemoService demoService;

    @RequestMapping("/getName")
    public String getName(){
        String result = demoService.getName(" i am consumer");
        System.out.println(result);
        return result;
    }
}
