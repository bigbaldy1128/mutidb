package com.example.demo.repository;

import com.example.demo.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wangjinzhao on 2017/7/4.
 */
@Mapper
public interface TestMapper {
    List<Test> queryInfo();

    void insertInfo(Test test);
}
