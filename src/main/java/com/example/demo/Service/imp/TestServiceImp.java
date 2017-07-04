package com.example.demo.Service.imp;

import com.example.demo.Service.ITestService;
import com.example.demo.domain.Test;
import com.example.demo.repository.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wangjinzhao on 2017/7/4.
 */
@Service
@Transactional
public class TestServiceImp implements ITestService {
    @Autowired
    private TestMapper testMapper;

    public List<Test> queryInfo(){
        return testMapper.queryInfo();
    }

    public void insert(){
        try {
            Test test=new Test();
            test.setName("A");
            testMapper.insertInfo(test);
            int a=5/0;
            Test test1=new Test();
            test1.setName("B");
            testMapper.insertInfo(test1);
        }
        catch (Exception ex){

        }

    }
}
