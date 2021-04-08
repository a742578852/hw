package com.information.five.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.information.five.mapper.*;
import com.information.five.model.*;
import com.information.five.model.extem.AnswerEx;
import com.information.five.service.SubjectSeervice;
import com.information.five.util.DateUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SubjectServiceImpl implements SubjectSeervice {
    @Autowired
    SubjectMapper subjectMapper;
    @Autowired
    QuestionMapper questionMapper;
    @Autowired
    EduStudyinfoMapper eduStudyinfoMapper;
    @Autowired
    ScoreMapper scoreMapper;
    @Autowired
    SchemesMapper schemesMapper;
    @Autowired
    EduPxzlinfoMapper eduPxzlinfoMapper;

    @Override
    @DS("#tb")
    public List<Subject> queryAll(String tb) {
        return subjectMapper.queryAll();
    }

    @Override
    @DS("#tb")
    public int queryTopicCount(String questionName, String tb) {

        return questionMapper.queryQuestionByKmmc(questionName);
    }

    @Override
    @DS("#tb")
    public int queryStudyCount(String subjectName, String userName, String tb) {

        return eduStudyinfoMapper.querystudyInfoByKmAndUsername(subjectName, userName);
    }

    @Override
    @DS("#db")
    public int insertStudyInfo(Long questionId, SystemAdmin systemAdmin, String db) {
        Question question = questionMapper.selectByPrimaryKey(questionId);
        EduStudyinfo eduStudyinfo = new EduStudyinfo();
        eduStudyinfo.setKmmc(question.getKmmc());
        eduStudyinfo.setCreatedAt(new Date());
        eduStudyinfo.setStlx(question.getTx());
        eduStudyinfo.setStnr(question.getContent());
        eduStudyinfo.setXm(systemAdmin.getNick());
        eduStudyinfo.setXxsj(DateUtils.formatTime(new Date()));
        eduStudyinfo.setTkid(questionId);
        return eduStudyinfoMapper.insertSelective(eduStudyinfo);
    }

    @Override
    @DS("#db")
    public int queryStudyInfo(String db, Long quertionId, SystemAdmin systemAdmin) {


        return eduStudyinfoMapper.queryStudyByQuestinidAndUsername(quertionId, systemAdmin.getNick());
    }

    @Override
    @DS("#tb")
    public List<Question> getQuestion(String tb, Long subjectId, String username) {

        Subject subject = subjectMapper.selectByPrimaryKey(subjectId);
        List<Question> mapList = new ArrayList<>();
        //根据科目获取所有题目
        List<Question> questions = questionMapper.queryQuestionByKm(subject.getKmmc());
        //查询我当前的学习记录
        List<EduStudyinfo> eduStudyinfos = eduStudyinfoMapper.queryStydyByXm(username);
        for (Question question : questions) {

            int i = 0;
            question.setType(0);
            for (EduStudyinfo eduStudyinfo : eduStudyinfos) {
                if (question.getId().equals(eduStudyinfo.getTkid())) {
                    i = 1;
                    question.setType(1);
                    break;
                }
            }
            mapList.add(question);

        }

        return mapList;
    }

    @Override
    @DS("#db")
    public List<Score> getScore(String db, SystemAdmin systemAdmin) {

        List<Score> scoreList = scoreMapper.getScoreByUsername(systemAdmin.getNick());
        return scoreList;
    }

    @Override
    @DS("#db")
    public Map getquestions(String db, Long scoreId) {
        //获取试卷信息
        Score score = scoreMapper.selectByPrimaryKey(scoreId);
        //获取试题
        String questions = score.getRandst().replace("|5||", ",").replace("|5", ",");
        //转数组
        String[] scoreQuestion = questions.split(",");
        //查询出所有题目
        List<Question> questionList = questionMapper.queryQusetinById(scoreQuestion);
        Map map = new HashMap();
        map.put("score", score);
        map.put("questions", questionList);
        return map;
    }

    @Override
    @DS("#db")
    public int markingExam(String db, String answer, Long scoreId) {
        //获取考试成绩
        Score score = scoreMapper.selectByPrimaryKey(scoreId);
        //单选题得分
        int sintScore = 0;
        //多选题得分
        int multScore = 0;
        //判断题得分
        int jugtScore = 0;
        //填空题得分
        int blntScore = 0;
        //总分
        int totalScore = 0;

        //获取当前分值分配
        List<Schemes> schemesList = schemesMapper.querySchemesBySjmcid(score.getSjmcid().longValue());

        //转json对象数组
        List<AnswerEx> answerExes = JSON.parseArray(answer, AnswerEx.class);
        for (AnswerEx answerEx : answerExes) {
            //获取试题信息和分值
            //获取试题
            Question question = questionMapper.selectByPrimaryKey(answerEx.getQuestionId());
            if (question != null) {
                //判断当前题是否正确
                if (question.getAnswer().equals(answerEx.getAnswer())) {
                    //分数
                    for (Schemes schemes : schemesList) {
                        if (schemes.getTx().equals(question.getTx()) && schemes.getZjmc().equals(question.getZjmc())) {

                            if (schemes.getTx().equals("单选题")) {
                                sintScore += schemes.getDvalue();
                                totalScore += schemes.getDvalue();
                            } else if (schemes.getTx().equals("多选题")) {
                                multScore += schemes.getDvalue();
                                totalScore += schemes.getDvalue();
                            } else if (schemes.getTx().equals("判断题")) {
                                jugtScore += schemes.getDvalue();
                                totalScore += schemes.getDvalue();
                            } else {
                                blntScore += schemes.getDvalue();
                                totalScore += schemes.getDvalue();
                            }
                            break;
                        }
                    }


                }

            }
        }
        Score inScore = new Score();
        inScore.setId(scoreId);
        inScore.setSint(sintScore);
        inScore.setMult(multScore);
        inScore.setJugt(jugtScore);
        inScore.setBlnt(blntScore);
        inScore.setTotal(totalScore);
        inScore.setYesno(2);
        inScore.setIssubmited(1);
        inScore.setAnswer(answer);

        return scoreMapper.updateByPrimaryKeySelective(inScore);
    }

    @Override
    @DS("#db")
    public List<EduPxzlinfo> getTrainingMaterials(String db) {
        return eduPxzlinfoMapper.queryAll();
    }
}
