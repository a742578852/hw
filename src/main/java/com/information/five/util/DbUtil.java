package com.information.five.util;

/**
 * 获取数据库
 */
public class DbUtil {

    final static String HMAD = "47.114.110.211:9000";//惠盟地址

    final static String HMDB = "hm";//惠盟Service
    //-------------------------------------------
    final static String TESTAD = "127.0.0.1:8080";//测试库地址

    final static String TESTDB = "test1";//测试Service

    public static String getDb(String address){

        String db = null;
    switch (address){
        //惠盟
        case HMAD:
            db = HMDB;
            break;
        case TESTAD:
            db = TESTDB;
            break;
    }

    return db;
    }

}
