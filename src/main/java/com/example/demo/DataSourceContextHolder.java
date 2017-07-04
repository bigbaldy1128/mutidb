package com.example.demo;

/**
 * Created by wangjinzhao on 2017/7/4.
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    static void setDB(String dbType) {
        contextHolder.set(dbType);
    }

    static String getDB() {
        return (contextHolder.get());
    }
}
