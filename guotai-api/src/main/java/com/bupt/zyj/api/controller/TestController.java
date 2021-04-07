package com.bupt.zyj.api.controller;

import com.bupt.zyj.model.testModel;
import com.bupt.zyj.service.testService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

@Controller
@RequestMapping("test")
public class TestController {
    @Resource
    private testService testService;
    @ResponseBody
    @RequestMapping("1")
    public testModel test()
    {
        System.out.println("hello world");
        return testService.getAll();
    }
}
