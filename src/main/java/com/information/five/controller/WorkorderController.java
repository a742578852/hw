package com.information.five.controller;

import com.information.five.model.*;
import com.information.five.service.SystemAdminService;
import com.information.five.service.WorkorderService;
import com.information.five.util.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    @PostMapping("changeFireOrder")
    @ApiOperation("动火证修改添加")
    public Result changeFireOrder(HttpServletRequest request,@RequestBody ZyaqDhzinfo zyaqDhzinfo) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());

        if (null == zyaqDhzinfo) {
            return new Result(202, true, "动火票数据丢失");
        }

        return new Result(200, true, "操作成功", workorderService.changeFireOrder(db, zyaqDhzinfo));


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
    public Result getHighorderDetail(HttpServletRequest request, Long orderId) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200, true, "获取成功", workorderService.getHighorderDetail(db, orderId));
    }

    @PostMapping("changeHighOrder")
    @ApiOperation("修改添加高处作业票")
    public Result changeHighOrder(HttpServletRequest request, @RequestBody ZyaqGczinfo zyaqGczinfo) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        if (zyaqGczinfo == null) {
            return new Result(202, true, "高处作业票数据丢失");

        }
        return new Result(200, true, "操作成功", workorderService.changeHighOrder(db, zyaqGczinfo));
    }


    //------------------------------------------------------------

    @PostMapping("getSpaceorderList")
    @ApiOperation("获取受限空间列表")
    public Result getSpaceorderList(HttpServletRequest request) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200, true, "获取成功", workorderService.getSpaceorderList(db));

    }

    @PostMapping("getSpaceorderDetail")
    @ApiOperation("获取受限空间票详情")
    public Result getSpaceorderDetail(HttpServletRequest request, Long orderId) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200, true, "获取成功", workorderService.getSpaceorderDetail(db, orderId));
    }

    @PostMapping("changeSpaceOrder")
    @ApiOperation("添加修改受限空间票")
    public Result changeSpaceOrder(HttpServletRequest request, @RequestBody ZyaqSxkjzinfo zyaqSxkjzinfo) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        if (null == zyaqSxkjzinfo) {
            return new Result(202, true, "受限空间票数据丢失");
        }


        return new Result(200, true, "操作成功", workorderService.changeSpaceOrder(db, zyaqSxkjzinfo));

    }
//--------------------------------------------------------------------------

    @PostMapping("getHoistingorderList")
    @ApiOperation("获取吊装作业列表")
    public Result getHoistingordrList(HttpServletRequest request) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200, true, "获取成功", workorderService.getHoistingordrList(db));
    }

    @PostMapping("getHoistingorderDetail")
    @ApiOperation("获取吊装作业票详情")
    public Result getHoistingorderDetail(HttpServletRequest request, Long orderId) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);

        return new Result(200, true, "获取成功", workorderService.getHoistingorderDetail(db, orderId));
    }

    @PostMapping("changeHoistingOrder")
    @ApiOperation("修改添加吊装票")
    public Result changeHoistingOrder(HttpServletRequest request, @RequestBody ZyaqDzzinfo zyaqDzzinfo) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        if (zyaqDzzinfo == null) {

            return new Result(202, true, "吊装票数据丢失");
        }

        return new Result(200, true, "操作成功", workorderService.changeHoistingOrder(db, zyaqDzzinfo));
    }

    //---------------------------------------------------------------------------

    @PostMapping("getelectricorderList")
    @ApiOperation("获取临时用电作业票列表")
    public Result getelectricorderList(HttpServletRequest request) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);
        return new Result(200, true, "获取成功", workorderService.getelectricorderList(db));
    }

    @PostMapping("getelectricorderDetail")
    @ApiOperation("获取临时用电作业票详情")
    public Result getelectricorderDetail(HttpServletRequest request, Long orderId) {
        String db = (String) request.getAttribute("db");

        return new Result(200, true, "获取成功", workorderService.getelectricorderDetail(db, orderId));
    }

    @PostMapping("changeElectricOrder")
    @ApiOperation("修改添加临时用电票")
    public Result changeElectricOrder(HttpServletRequest request, @RequestBody ZyaqLsydzinfo zyaqLsydzinfo) {
        String db = (String) request.getAttribute("db");

        if (null == zyaqLsydzinfo) {

            return new Result(202, true, "临时用电票数据丢失");
        }

        return new Result(200, true, "操作成功", workorderService.changeElectricOrder(db, zyaqLsydzinfo));

    }

    //-----------------------------------------------------------------------

    @PostMapping("getSoilorderList")
    @ApiOperation("获取动土证列表")
    public Result getSoilorderList(HttpServletRequest request) {
        String db = (String) request.getAttribute("db");

        return new Result(200, true, "获取成功", workorderService.getSoilorderList(db));
    }

    @PostMapping("getSoilorderDetail")
    @ApiOperation("获取动土详情")
    public Result getSoilorderDetail(HttpServletRequest request, Long orderId) {
        String db = (String) request.getAttribute("db");

        return new Result(200, true, "获取成功", workorderService.getSoilorderDetail(db, orderId));
    }

    @PostMapping("changeSoilOrder")
    @ApiOperation("修改添加动土票")
    public Result changeSoilOrder(HttpServletRequest request, @RequestBody ZyaqDtzinfo zyaqDtzinfo) {
        String db = (String) request.getAttribute("db");

        if (zyaqDtzinfo == null){
            return new Result(202,true,"动土票数据丢失");
        }

        return new Result(200,true,"操作成功",workorderService.changeSoilOrder(db,zyaqDtzinfo));

    }

    //-----------------------------------------------------------------------------


    @PostMapping("getWallorderList")
    @ApiOperation("盲板抽堵列表")
    public Result getWallorderList(HttpServletRequest request) {
        String db = (String) request.getAttribute("db");

        return new Result(200, true, "获取成功", workorderService.getWallorderList(db));
    }


    @PostMapping("getWallorderDetail")
    @ApiOperation("盲毒抽板详情")
    public Result getWallorderDetail(HttpServletRequest request, Long orderId) {

        String db = (String) request.getAttribute("db");

        return new Result(200, true, "获取成功", workorderService.getWallorderDetail(db, orderId));


    }

    @PostMapping("changeWallOrder")
    @ApiOperation("添加修改盲板抽堵票")
    public Result changeWallOrder(HttpServletRequest request,@RequestBody ZyaqMbcdzinfo zyaqMbcdzinfo){
        String db = (String) request.getAttribute("db");
        if (zyaqMbcdzinfo == null){
            return new Result(202,true,"盲板抽都票数据丢失");
        }

        return new Result(200,true,"操作成功",workorderService.changeWallOrder(db,zyaqMbcdzinfo));

    }

    //------------------------------------------------------------------------------

    @PostMapping("getBreakorderList")
    @ApiOperation("断路作业列表")
    public Result getBreakorderList(HttpServletRequest request) {
        String db = (String) request.getAttribute("db");

        return new Result(200, true, "获取成功", workorderService.getBreakorderList(db));
    }

    @PostMapping("getBreakorderDetail")
    @ApiOperation("获取断路票详情")
    public Result getBreakorderDetail(HttpServletRequest request, Long orderId) {

        String db = (String) request.getAttribute("db");

        return new Result(200, true, "获取成功", workorderService.getBreakorderDetail(db, orderId));
    }

    @PostMapping("changeBreakOrder")
    @ApiOperation("修改添加断路票")
    public Result changeBreakOrder(HttpServletRequest request,@RequestBody ZyaqDlzinfo zyaqDlzinfo){
        String db = (String) request.getAttribute("db");
        if (zyaqDlzinfo == null){
            return new Result(202,true,"断路票数据丢失");
        }

        return new Result(200,true,"操作成功",workorderService.changeBreakOrder(db,zyaqDlzinfo));
    }

    @GetMapping("getSafetyMeasures")
    @ApiOperation("获取安全措施")
    public Result getSafetyMeasures(HttpServletRequest request,String orderName){
        String db = (String) request.getAttribute("db");
        List<ZyaqAqcsszinfo> aqcsszinfos = workorderService.getZyaqAqcsszinfo(db,orderName);

        return new Result(200,true,"操作成功",aqcsszinfos);
    }

}


