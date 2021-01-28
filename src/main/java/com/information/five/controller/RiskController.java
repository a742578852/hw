package com.information.five.controller;


import com.information.five.config.DicConfig;
import com.information.five.mapper.YhpcYhzgdinfoMapper;
import com.information.five.model.FxbsFxsbinfo;
import com.information.five.model.SystemAdmin;
import com.information.five.model.YhpcYhzgdinfo;
import com.information.five.service.RiskService;
import com.information.five.service.SystemAdminService;
import com.information.five.util.DateUtils;
import com.information.five.util.Result;
import com.information.five.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@Api(tags = "风险上报,隐患整改相关")
@RequestMapping("api/risk")
public class RiskController {

    @Autowired
    SystemAdminService systemAdminService;
    @Autowired
    RiskService riskService;


    /**
     * 时间格式化
     */
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");


    @PostMapping("getRisks")
    @ApiOperation("获取所有风险信息")
    public Result getRisks(@ApiIgnore HttpServletRequest request) {
        String db = (String) request.getAttribute("db");
        List<FxbsFxsbinfo> fxbsFxsbinfos = riskService.getRisksAll(db);

        return new Result(200, true, "获取成功", fxbsFxsbinfos);
    }

    @PostMapping("getRisk")
    @ApiOperation("查看该风险信息")
    @ApiImplicitParam(name = "riskId", value = "风险上报id", dataType = "Long", required = true)
    public Result getRisk(@ApiIgnore HttpServletRequest request, Long riskId) {
        String db = (String) request.getAttribute("db");
        return new Result(200, true, "获取成功", riskService.getFxbsFxsbinfoById(db, riskId));

    }

    @PostMapping("getDangerByRisk")
    @ApiOperation("该风险相关联的隐患")
    @ApiImplicitParam(name = "riskId", value = "风险上报id", dataType = "Long", required = true)
    public Result getDangerByRisk(@ApiIgnore HttpServletRequest request, Long riskId) {
        String db = (String) request.getAttribute("db");

        List<YhpcYhzgdinfo> yhpcYhzgdinfos = riskService.getYhzgdinfoByRiskId(db, riskId);

        return new Result(200, true, "获取成功", yhpcYhzgdinfos);
    }

    @PostMapping("getDangerDetail")
    @ApiOperation("获取隐患整改单详情")
    public Result getDangerDetail(Long id,HttpServletRequest request){
        String db = (String) request.getAttribute("db");

        return new Result(200,true,"获取成功",riskService.getDangerDetail(db,id));
    }


    @PostMapping("riskReport")
    @ApiOperation("风险上报添加/修改")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "riskId", value = "id", dataType = "Long", required = false),
            @ApiImplicitParam(name = "fxwz", value = "风险位置", dataType = "String", required = true),
            @ApiImplicitParam(name = "fxms", value = "风险描述", dataType = "String", required = true),
            @ApiImplicitParam(name = "fxys", value = "风险因素", dataType = "String", required = true),
            @ApiImplicitParam(name = "fxrxm", value = "风险发现人", dataType = "String", required = true),
            @ApiImplicitParam(name = "fxrq", value = "风险发现日期", dataType = "String", required = true),
            @ApiImplicitParam(name = "file", value = "附件", dataType = "file", required = false)
    })
    public Result riskReport(Long riskId, String fxwz, String fxms, String fxys, String fxrxm, String fxrq,
                             @RequestParam("file") MultipartFile file, @ApiIgnore HttpServletRequest request) throws IOException {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);
        //风险上报信息
        FxbsFxsbinfo fxbsFxsbinfo = new FxbsFxsbinfo();
        fxbsFxsbinfo.setId(riskId);
        fxbsFxsbinfo.setFxwz(fxwz);
        fxbsFxsbinfo.setFxms(fxms);
        fxbsFxsbinfo.setFxys(fxys);
        fxbsFxsbinfo.setFxrxm(fxrxm);
        fxbsFxsbinfo.setFxrq(fxrq);
        fxbsFxsbinfo.setCreatedAt(new Date());

        if (!file.isEmpty()) {
            //附件上传
            //文件夹地址
            String prefix = DicConfig.FILEPATH;
            String add = DicConfig.IMGPATH + simpleDateFormat.format(new Date()) + "/";
            prefix = prefix + add;
            //文件后缀
            String suffix = file.getOriginalFilename();

            try {
                suffix = suffix.substring(file.getOriginalFilename().lastIndexOf("."));
                //文件名
                String fileName = StringUtils.getUuid() + suffix;
                //创建文件夹
                File dir = new File(prefix);
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                //4.创建这个新文件
                File newFile = new File(prefix + fileName);

                //5.复制操作

                file.transferTo(newFile);
                //协议 :// ip地址 ：端口号 / 文件目录(/images/2020/03/15/xxx.jpg)
                String savePath = add + fileName;
                fxbsFxsbinfo.setFj(savePath);
            }catch (Exception e){

            }


        }

        riskService.addFxsbInfo(fxbsFxsbinfo, db);
        return new Result(200, true, "上报成功");


    }


    @PostMapping("fillDanger")
    @ApiOperation("隐患整改单填报")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "yhpcYhzgdinfo", value = "隐患整改单对象", dataType = "yhpcYhzgdinfo", required = true),
            @ApiImplicitParam(name = "file", value = "附件", dataType = "file", required = true)
    })
    public Result fillDanger(YhpcYhzgdinfo yhpcYhzgdinfo, @ApiIgnore HttpServletRequest request, @RequestParam("file") MultipartFile file) {
        String db = (String) request.getAttribute("db");

        //如果整改单号为空
        if (StringUtils.isEmptyString(yhpcYhzgdinfo.getZgdbh())) {
            //生成隐患整改单编号
            String front = "YHZGD";
            String in = DateUtils.getYear();
            //获取最后一段
            //获取最后一条数据
            String after = riskService.getLastYhzginfo(db).getZgdbh();
            String num[] = after.split("-");
            int after1 = Integer.parseInt(num[2]);
            String newAfter;
            if (after1 >= 0 && after1 <= 9) {
                newAfter = "000" + after1;
            } else if (after1 >= 10 && after1 <= 99) {
                newAfter = "00" + after1;
            } else if (after1 >= 100 && after1 <= 999) {
                newAfter = "0" + after1;
            } else {
                newAfter = after1 + "";
            }

            String zgdbh = front + "-" + in + "-" + newAfter;
            yhpcYhzgdinfo.setZgdbh(zgdbh);
        }


        //附件上传
        //文件夹地址
        String prefix = DicConfig.FILEPATH;
        String add = DicConfig.IMGPATH + simpleDateFormat.format(new Date()) + "/";
        prefix = prefix + add;
        //文件后缀
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //文件名
        String fileName = StringUtils.getUuid() + suffix;
        //创建文件夹
        File dir = new File(prefix);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //4.创建这个新文件
        File newFile = new File(prefix + fileName);

        //5.复制操作
        try {
            file.transferTo(newFile);
            //协议 :// ip地址 ：端口号 / 文件目录(/images/2020/03/15/xxx.jpg)
            String savePath = add + fileName;
            yhpcYhzgdinfo.setYhzp(savePath);

            riskService.addYhzgdinfo(db, yhpcYhzgdinfo);
            return new Result(200, true, "操作成功");
        } catch (IOException e) {
            return new Result(204, true, "操作失败");
        }


    }




}
