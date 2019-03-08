package com.graduation.controller;

import com.graduation.common.utils.apiresult.AbstractApiResult;
import com.graduation.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by beyondLi
 * Date 2019/3/8 15:47
 * Desc .
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @Resource
    HelloService helloService;

    @RequestMapping(value = "/add/info", method = RequestMethod.GET)
    public AbstractApiResult addInfo() {
        helloService.addInfo();
        return AbstractApiResult.success("success");
    }

}
