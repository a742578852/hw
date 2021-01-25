package com.information.five.controller;

import com.information.five.model.FxypAqcninfo;
import com.information.five.model.FxypBzjinfo;
import com.information.five.model.FxypYpnrinfo;
import com.information.five.model.SystemAdmin;
import com.information.five.service.JudgeService;
import com.information.five.service.SystemAdminService;
import com.information.five.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@Api(tags = "风险研判")
@RequestMapping("api/judge")
public class JudgeController {

    @Autowired
    SystemAdminService systemAdminService;
    @Autowired
    JudgeService judgeService;

    /**
     * 查看所有风险研判信息，时间倒序，关键字查询(班组,部门),填报时间查询
     */
    @PostMapping("getJudgeInfoByParms")
    @ApiOperation("查看所有风险研判信息，时间倒序")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "params",value = "关键字",dataType = "String",required = true),
            @ApiImplicitParam(name = "date",value = "时间",dataType = "String",required = true)
    })
    public Result getJudgeInfoByParms(String params, String date, @ApiIgnore HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);
        return new Result(200,true,"数据获取成功",judgeService.getFxypinfo(db));
    }

    @PostMapping("getBzjinfoByBzId")
    @ApiOperation("根据班组级研判id获取研判和承诺信息")
    @ApiImplicitParam(name = "bid",value = "班组级研判信息id",dataType = "long",required = true)
    public Result getBzjinfoByBzId(@ApiIgnore HttpServletRequest request,Long bid){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);


        return new Result(200,true,"获取成功",judgeService.getBzjInfos(bid,db));

    }

    @PostMapping("addOrUpdateJudge")
    @ApiOperation("新增/修改班组研判")
    @ApiImplicitParam(name = "data",value = "参数data:{bzjinfo:{},chengnuo:{},ypnr:{}}",dataType = "Map",required = true
    )
    public Result addOrUpdateJudge(@RequestBody Map<String,Object> data,@ApiIgnore HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);
        //班组级研判信息
        FxypBzjinfo fxypBzjinfo = (FxypBzjinfo) data.get("bzjinfo");
        //班组级研判详情
        FxypYpnrinfo fxypYpnrinfo = (FxypYpnrinfo) data.get("ypnr");
        //承诺
        FxypAqcninfo fxypAqcninfo = (FxypAqcninfo) data.get("chengnuo");


        int i = judgeService.addOrUpdateJudge(db,fxypBzjinfo,fxypYpnrinfo,fxypAqcninfo);

        return new Result(200,true,"操作成功");

    }


    @PostMapping("nzjHzCj")
    @ApiOperation("车间班组级汇总")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "date",value = "汇总时间",dataType = "String",required = true),
            @ApiImplicitParam(name = "cj",value = "车间",dataType = "String",required = true),
            @ApiImplicitParam(name = "sbr",value = "上报人",dataType = "String",required = true)
    })
    public Result nzjHzCj(@ApiIgnore HttpServletRequest request,String date,String cj,String sbr){

        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);




        return new Result();


    }



}
