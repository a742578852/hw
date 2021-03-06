package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.information.five.mapper.YhpcYhzgdinfoMapper;
import com.information.five.model.YhpcYhzgdinfo;
import com.information.five.service.StacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class StacServiceImpl implements StacService {
    @Autowired
    YhpcYhzgdinfoMapper yhpcYhzgdinfoMapper;

    @Override
    @DS("#db")
    public Map getDangerStacByComrate(String db, String year) throws ParseException {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        //根据选择日期查询所有隐患
        List<YhpcYhzgdinfo> yhpcYhzgdinfos = yhpcYhzgdinfoMapper.queryZgdinfoByDate(year);
        //发现问题数量
        int sum = yhpcYhzgdinfos.size();
        //按期完成数量
        int completeCount = 0;
        //整改中
        int completeingCount = 0;
        //未按期整改
        int noCompleteCount = 0;

        //当前日期

        String nowDate = s.format(new Date());

        for (YhpcYhzgdinfo yhpcYhzgdinfo:yhpcYhzgdinfos){
            //整改期限
            String zgqx = yhpcYhzgdinfo.getZgqx();
            //整改完成日期
            String zgwcrq = yhpcYhzgdinfo.getZgwcrq();

            if ((zgwcrq == null || zgwcrq.equals("")) && !(yhpcYhzgdinfo.getJdmc().equals("流程结束"))){

                //判断是否按期
                if ((sdf.parse(zgqx)).before(sdf.parse(nowDate)) ){
                    noCompleteCount++;
                }else {
                    completeingCount++;
                }
            }else {
                //判断完成日期是否在期限内
//                if ((sdf.parse(zgqx)).before(sdf.parse(zgwcrq))){
//                    noCompleteCount++;
//                }else {
                    completeCount++;
//                }

            }

        }

        Map map = new HashMap();
        map.put("sum",sum);
        map.put("completeCount",completeCount);
        map.put("completeingCount",completeingCount);
        map.put("noCompleteCount",noCompleteCount);



        return map;
    }

    @Override
    @DS("#db")
    public Map getDangerByArea(String db) {

        List<Map> maps = yhpcYhzgdinfoMapper.queryZgdinfoByArea();

        List areaList = new ArrayList();

        List countList = new ArrayList();

        for (Map map:maps){
            areaList.add(map.get("area"));
            countList.add(map.get("count"));
        }
        Map map = new HashMap();
        map.put("categories",areaList);

        Map map1 = new HashMap();
        map1.put("name","数量");
        map1.put("data",countList);
        List serList = new ArrayList();
        serList.add(map1);
        map.put("series",serList);


        return map;
    }

    @Override
    @DS("#db")
    public List getDangerByClass(String db) {


        return yhpcYhzgdinfoMapper.queryZgadinfoByClass();
    }
}
