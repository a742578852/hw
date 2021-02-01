package com.information.five.controller;

import com.information.five.model.SystemAdmin;
import com.information.five.service.SystemAdminService;
import com.information.five.service.WorkorderService;
import com.information.five.util.Result;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Api(tags = "作业票")
@RequestMapping("api/workorder")
public class WorkorderController {

    @Autowired
    SystemAdminService systemAdminService;
    @Autowired
    WorkorderService workorderService;

    @PostMapping("getFireorderList")
    @ApiOperation("获取动火票列表")
    public Result getFireorderList(HttpServletRequest request) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);


        return new Result(200, true, "获取成功", workorderService.getFireorderList(db));
    }


    @PostMapping("getFireorderDetail")
    @ApiOperation("获取动火票详情")
    public Result getFireorderDetail(HttpServletRequest request, Long orderId) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200, true, "获取成功", workorderService.getFireorderDetail(db, orderId));
    }

    //--------------------------------------------------

    @PostMapping("getHighorderList")
    @ApiOperation("获取高处作业证列表")
    public Result getHighorderList(HttpServletRequest request) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200, true, "获取成功", workorderService.getHighorderList(db));
    }

    @PostMapping("getHighorderDetail")
    @ApiOperation("获取高处作业证详情")
    public Result getHighorderDetail(HttpServletRequest request,Long orderId){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200,true,"获取成功",workorderService.getHighorderDetail(db,orderId));
    }

    //------------------------------------------------------------

    @PostMapping("getSpaceorderList")
    @ApiOperation("获取受限空间列表")
    public Result getSpaceorderList(HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200,true,"获取成功",workorderService.getSpaceorderList(db));

    }

    @PostMapping("getSpaceorderDetail")
    @ApiOperation("获取受限空间票详情")
    public Result getSpaceorderDetail(HttpServletRequest request,Long orderId){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200,true,"获取成功",workorderService.getSpaceorderDetail(db,orderId));
    }
//--------------------------------------------------------------------------

    @PostMapping("getHoistingorderList")
    @ApiOperation("获取吊装作业列表")
    public Result getHoistingordrList(HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200,true,"获取成功",workorderService.getHoistingordrList(db));
    }

    @PostMapping("getHoistingorderDetail")
    @ApiOperation("获取吊装作业票详情")
    public Result getHoistingorderDetail(HttpServletRequest request,Long orderId){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200,true,"获取成功",workorderService.getHoistingorderDetail(db,orderId));
    }

    //---------------------------------------------------------------------------

    @PostMapping("getelectricorderList")
    @ApiOperation("获取临时用电作业票列表")
    public Result getelectricorderList(HttpServletRequest request){
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);
        return new Result(200,true,"获取成功",workorderService.getelectricorderList(db));
    }

    @PostMapping("getelectricorderDetail")
    @ApiOperation("获取临时用电作业票详情")
    public Result getelectricorderDetail(HttpServletRequest request,Long orderId){
        String db = (String) request.getAttribute("db");

        return new Result(200,true,"获取成功",workorderService.getelectricorderDetail(db,orderId));
    }

    //-----------------------------------------------------------------------

    @PostMapping("getSoilorderList")
    @ApiOperation("获取动土证列表")
    public Result getSoilorderList(HttpServletRequest request){
        String db = (String) request.getAttribute("db");

        return new Result(200,true,"获取成功",workorderService.getSoilorderList(db));
    }

    @PostMapping("getSoilorderDetail")
    @ApiOperation("获取动土详情")
    public Result getSoilorderDetail(HttpServletRequest request,Long orderId){
        String db = (String) request.getAttribute("db");

        return new Result(200,true,"获取成功",workorderService.getSoilorderDetail(db,orderId));
    }

    //-----------------------------------------------------------------------------



    @PostMapping("getWallorderList")
    @ApiOperation("盲板抽堵列表")
    public Result getWallorderList(HttpServletRequest request){
        String db = (String) request.getAttribute("db");

        return new Result(200,true,"获取成功",workorderService.getWallorderList(db));
    }


    @PostMapping("getWallorderDetail")
    @ApiOperation("盲毒抽板详情")
    public Result getWallorderDetail(HttpServletRequest request,Long orderId){

        String db = (String) request.getAttribute("db");

        return new Result(200,true,"获取成功",workorderService.getWallorderDetail(db,orderId));


    }

    //------------------------------------------------------------------------------

    @PostMapping("getBreakorderList")
    @ApiOperation("断路作业列表")
    public Result getBreakorderList(HttpServletRequest request){
        String db = (String) request.getAttribute("db");

        return new Result(200,true,"获取成功",workorderService.getBreakorderList(db));
    }

    @PostMapping("getBreakorderDetail")
    @ApiOperation("获取断路票详情")
    public Result getBreakorderDetail(HttpServletRequest request,Long orderId){

        String db = (String) request.getAttribute("db");

        return new Result(200,true,"获取成功",workorderService.getBreakorderDetail(db,orderId));
    }

}


