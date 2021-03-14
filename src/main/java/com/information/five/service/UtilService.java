package com.information.five.service;

import com.information.five.model.BaseBminfo;
import com.information.five.model.SystemAdmin;
import com.information.five.model.SystemDictionary;

import java.util.List;

public interface UtilService {

    /**
     * 获取所有部门
     * @return
     */
    List<BaseBminfo> getBminfo(String db);

    /**
     * 获取所有用户根据关键字
     * @param db
     * @param username
     * @return
     */
    List<SystemAdmin> getAdmin(String db,String username);

    /**
     * 查询字典
     * @param db
     * @param code
     * @return
     */
    List<SystemDictionary> getDictionary(String db, String code);

}
