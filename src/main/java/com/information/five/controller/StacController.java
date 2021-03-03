package com.information.five.controller;

import com.information.five.model.SystemAdmin;
import com.information.five.service.StacService;
import com.information.five.service.SystemAdminService;
import com.information.five.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("api/stac")
@Api("统计分析模块")
public class StacController {
    @Autowired
    SystemAdminService systemAdminService;
    @Autowired
    StacService stacService;

    @PostMapping("getDangerStacByComrate")
    @ApiOperation("隐患整改统计")
    public Result getDangerStacByComrate(@ApiIgnore HttpServletRequest request,String year) throws ParseException {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);



        return new Result(200,true,"获取成功",stacService.getDangerStacByComrate(db,year));
    }


    @PostMapping("getDangerByArea")
    @ApiOperation("根据区域获取统计")
    public Result getDangerByArea(@ApiIgnore HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);


        return new Result(200,true,"获取成功",stacService.getDangerByArea(db));
    }

    @PostMapping("getDangerByClass")
    @ApiOperation("根据隐患分类获取统计")
    public Result getDangerByClass(@ApiIgnore HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);
        List list = stacService.getDangerByClass(db);
        return new Result(200,true,"获取成功",list);
    }

}
