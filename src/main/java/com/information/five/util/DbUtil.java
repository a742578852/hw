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

    //-------------------------------------------------
    final static String HJAD = "47.114.110.211:8021";//恒基
    final static String HJDB = "hj";

    //-----------------------------------------------
    final static String HTAD = "58.220.132.188:8001";//华泰
    final static String HTDB = "ht";

    //----------------------------------------------
    final static String HXAD = "218.92.167.118:8089";//焕鑫
    final static String HXDB = "hx";

    //-----------------------------------------------
    final static String XSAD = "47.114.110.211:8023";//
    final static String XSDB = "xs";

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
        case HJAD:
            db = HJDB;
            break;
        case HTAD:
            db = HTDB;
            break;
        case HXAD:
            db = HXDB;
            break;
        case XSAD:
            db = XSDB;
            break;
    }

    return db;
    }

}
