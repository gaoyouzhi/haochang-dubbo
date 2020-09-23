package com.haochang.dubbo.api.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.haochang.dubbo.api.DemoService;

/**
 * @description: 描述：demo 实现类
 * @author: youzhi.gao
 * @date: 2020-09-22 19:19
 */
@Service(group = "${dubbo.application.name}", version = "${dubbo.application.version}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String getName(String name) {
        return null;
    }
}
