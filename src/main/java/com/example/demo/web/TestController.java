package com.example.demo.web;

import com.example.demo.Service.ITestService;
import com.example.demo.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangjinzhao on 2017/7/4.
 */
@RestController
public class TestController {
    @Autowired
    ITestService testService;

    @GetMapping("/query")
    public List<Test> test() {
        return testService.queryInfo();
    }

    @GetMapping("/insert")
    public void insert(){
        testService.insert();
    }
}
