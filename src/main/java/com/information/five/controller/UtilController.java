package com.information.five.controller;

import com.information.five.model.SystemAdmin;
import com.information.five.service.SystemAdminService;
import com.information.five.service.UtilService;
import com.information.five.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/util")
@Api(tags = "工具接口")
public class UtilController {

    @Autowired
    SystemAdminService systemAdminService;
    @Autowired
    UtilService utilService;


    @PostMapping("getDepartment")
    @ApiOperation("获取所有部门")
    public Result getDepartment(@ApiIgnore HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);
        return new Result(200,true,"获取成功",utilService.getBminfo(db));

    }

    @PostMapping("getAllUser")
    @ApiOperation("根据用户名关键字获取用户名")
    @ApiImplicitParam(name = "userName",value = "用户名关键字",required = false,dataType = "String")
    public Result getAllUser(String userName,@ApiIgnore HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200,true,"获取成功",utilService.getAdmin(db,userName));
    }

}
