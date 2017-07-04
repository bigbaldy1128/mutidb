package com.example.demo.Service;

import com.example.demo.domain.Test;

import java.util.List;

/**
 * Created by wangjinzhao on 2017/7/4.
 */
public interface ITestService {
    List<Test> queryInfo();
    void insert();
}
