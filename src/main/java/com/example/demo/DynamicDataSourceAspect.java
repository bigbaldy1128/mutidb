package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by wangjinzhao on 2017/7/4.
 */
@Aspect
@Component
public class DynamicDataSourceAspect {
    private static final String[] dataSources = {"ds1", "ds2"};
    private static int index;

    @Before("execution(* com.example.demo.repository.TestMapper.queryInfo(..))")
    public void beforeSwitchDS(JoinPoint point) {
        DataSourceContextHolder.setDB(dataSources[linearPolling()]);
    }

    private int linearPolling() {
        return index++ % 2;
    }
}
