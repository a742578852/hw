package com.information.five.util;

/**
 * 获取数据库
 */
public class DbUtil {

    final static String HMAD = "47.114.110.211:9000";//惠盟地址

    final static String HMDB = "hm";//惠盟Service
    //-------------------------------------------
    final static String TESTAD = "127.0.0.1:8080";//测试库地址

    final static String TESTDB = "test";//测试Service

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
    final static String XSAD = "47.114.110.211:8023";//旭升
    final static String XSDB = "xs";

    //-----------------------------------------------
    final static String AJAD = "47.114.110.211:8025";//艾津
    final static String AJDB = "aj";

    //-----------------------------------------------
    final static String FYAD = "47.114.110.211:8012";//丰源
    final static String FYDB = "fy";

    //-----------------------------------------------
    final static String JMAD = "47.114.110.211:8022";//金马
    final static String JMDB = "jm";

    //-----------------------------------------------
    final static String JYAD = "47.114.110.211:8009";//九阳
    final static String JYDB = "jy";

    //-----------------------------------------------
    final static String TYAD = "47.114.110.211:8026";//天源
    final static String TYDB = "ty";

    //-----------------------------------------------
    final static String CZAD = "47.114.110.211:8011";//春竹
    final static String CZDB = "cz";


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
        case AJAD:
            db = AJDB;
            break;
        case FYAD:
            db = FYDB;
            break;
        case JMAD:
            db = JMDB;
            break;
        case JYAD:
            db = JYDB;
            break;
        case TYAD:
            db = TYDB;
            break;
        case CZAD:
            db = CZDB;
            break;

    }

    return db;
    }

}
