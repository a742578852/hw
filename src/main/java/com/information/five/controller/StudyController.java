package com.information.five.controller;

import com.information.five.mapper.SystemAdminMapper;
import com.information.five.model.Question;
import com.information.five.model.Score;
import com.information.five.model.Subject;
import com.information.five.model.SystemAdmin;
import com.information.five.model.extem.AnswerEx;
import com.information.five.service.SubjectSeervice;
import com.information.five.service.SystemAdminService;
import com.information.five.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/study")
@Api(tags = "学习和考试")
public class StudyController {
    @Autowired
    SubjectSeervice subjectSeervice;
    @Autowired
    SystemAdminService systemAdminService;

    /**
     * 获取所有科目
     *
     * @return
     */
    @ApiOperation("获取科目")
    @PostMapping("getSubject")
    public Result getSubject(@ApiIgnore HttpServletRequest request) {
        String tb = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, tb);
        List<Subject> subjectList = subjectSeervice.queryAll(tb);
        List<Map> mapList = new ArrayList<>();
        for (Subject subject : subjectList) {
            Map map = new HashMap();
            //当前科目总共题数
            int subjectTopicCount = subjectSeervice.queryTopicCount(subject.getKmmc(), tb);
            //当前科目学习记录数
            int studyCount = subjectSeervice.queryStudyCount(subject.getKmmc(), systemAdmin.getNick(), tb);
            map.put("subject", subject);
            map.put("questionCount", subjectTopicCount);
            map.put("studyCount", studyCount);
            mapList.add(map);
        }

        return new Result(200, true, "获取成功", mapList);
    }

    /**
     * 获取该科目所有题目
     *
     * @param subjectId
     * @param request
     * @return
     */
    @PostMapping("getTopic")
    @ApiOperation("获取该科目下所有题目")
    @ApiImplicitParam(name = "subjectId", value = "科目id", dataType = "Long", required = true)
    public Result getTopic(Long subjectId, @ApiIgnore HttpServletRequest request) {
        String tb = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, tb);

        //获取该科目所有题目
        List<Question> mapList = subjectSeervice.getQuestion(tb, subjectId, systemAdmin.getNick());

        return new Result(200, true, "获取成功", mapList);

    }

    @PostMapping("addStudyInfo")
    @ApiOperation("添加学习记录")
    @ApiImplicitParam(name = "questionId", value = "题目id", dataType = "Long", required = true)
    public Result addStudyInfo(Long questionId, HttpServletRequest request) {
        String tb = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, tb);
        //

        int i = 0;
        if (subjectSeervice.queryStudyInfo(tb, questionId, systemAdmin) == 0) {
            i = subjectSeervice.insertStudyInfo(questionId, systemAdmin, tb);
        }

        if (i >= 0) {
            return new Result(200, true, "添加成功");
        }
        return new Result(201, true, "添加失败");
    }

    /**
     * 获取我的考试
     *
     * @return
     */
    @PostMapping("getExam")
    @ApiOperation("获取我的考试")
    public Result getExam(@ApiIgnore HttpServletRequest request) {
        String tb = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, tb);
        List<Score> scoreList = subjectSeervice.getScore(tb, systemAdmin);

        return new Result(200, true, "获取成功", scoreList);

    }

    @PostMapping("getquestions")
    @ApiOperation("获取我的试卷信息")
    @ApiImplicitParam(name = "scoreId", value = "试卷id", dataType = "Long", required = true)
    public Result getquestions(@ApiIgnore HttpServletRequest request, Long scoreId) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);


        return new Result(200, true, "获取成功", subjectSeervice.getquestions(db, scoreId));

    }

    @PostMapping("markingExam")
    @ApiOperation("批改试卷")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "answer", value = "答案[{题目id:'',答案:''},{}]", required = true, dataType = "String"),
            @ApiImplicitParam(name = "scoreId", value = "成绩单id", required = true, dataType = "Long")
    })
    public Result markingExam(String answer, Long scoreId, HttpServletRequest request) {
        String db = (String) request.getAttribute("db");
        Long id = Long.parseLong(request.getAttribute("id").toString());
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminById(id, db);
        //answer = "["+answer+"]";
        System.out.println(answer+"!!!!!!!");
        subjectSeervice.markingExam(db, answer, scoreId);

        return new Result(200, true, "提交成功");

    }


}
