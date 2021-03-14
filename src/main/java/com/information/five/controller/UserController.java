package com.information.five.controller;

import com.information.five.mapper.SystemAdminMapper;
import com.information.five.model.SystemAdmin;
import com.information.five.service.SystemAdminService;
import com.information.five.util.IpUtil;
import com.information.five.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@Api(tags = "用户信息相关")
@RequestMapping("api/user")
public class UserController {
    @Autowired
    SystemAdminService systemAdminService;


    @PostMapping("getUser")
    public Result getUser(@ApiIgnore HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200,true,systemAdmin);
    }


    /**
     * 添加登录信息
     * @return
     */
    @PostMapping("addLoginInfo")
    public Result addLoginInfo(@ApiIgnore HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);
        systemAdmin.setHits(systemAdmin.getHits()+1);
        systemAdmin.setLastLoginIp(IpUtil.getIpAdrress(request));
        systemAdmin.setLastLoginTime(new Date());

        systemAdminService.updateSystem(systemAdmin,db);


        return new Result(200,true,"修改成功");
    }


    @GetMapping("authorityCheck")
    @ApiOperation("权限校验/首页入口显示")
    public Result authorityCheck(HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());


        return new Result(200,true,"获取成功",systemAdminService.authorityCheck(db,id));
    }

}
