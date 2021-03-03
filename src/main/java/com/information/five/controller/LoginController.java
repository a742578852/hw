package com.information.five.controller;


import com.information.five.model.SystemAdmin;
import com.information.five.service.SubjectSeervice;
import com.information.five.service.SystemAdminService;
import com.information.five.util.DbUtil;
import com.information.five.util.JwtUtils;
import com.information.five.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("login")
@Api(tags = "登录相关")
public class LoginController {
   @Autowired
    SystemAdminService systemAdminService;
   @Autowired
   SubjectSeervice subjectSeervice;

    @PostMapping("goLogin")
    @ApiOperation("登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "登录账号",dataType = "String",required = true),
            @ApiImplicitParam(name = "password",value = "密码",dataType = "String",required = true),
            @ApiImplicitParam(name = "address",value = "登录地址（ip:端口）",dataType = "String",required = true)
    })
    public Result goLogin(String username, String password,String address){

        String db = DbUtil.getDb(address);

        //判断端口
        if (db == null){
            return new Result(201,true,"连接失败,地址错误");
        }


        //验证登录
        if (systemAdminService.getSystemAdminInfo(username,password,db)){
            //token发放
            //获取用户信息
            SystemAdmin systemAdmin = systemAdminService.getSystemAdminByUserName(username,db);
            String token = JwtUtils.geneJsonToken(systemAdmin,db);
            Map map = new HashMap();
            map.put("token",token);
            map.put("admin",systemAdmin);
            return new Result(200,true,"token获取成功",map);
        }else {
            return new Result(201,true,"账号密码错误");
        }

    }

    /**
     * 测试连接
     * @param address
     * @return
     */
    @PostMapping("testConnection")
    @ApiOperation("连接测试")
    @ApiImplicitParam(name = "address",value = "地址",dataType = "String",required = true)
    public Result testConnection(String address){

        String db = DbUtil.getDb(address);
        //判断端口
        if (db == null){
            return new Result(202,true,"连接失败,地址错误");
        }
        return new Result(200,true,"连接成功");

    }






}
