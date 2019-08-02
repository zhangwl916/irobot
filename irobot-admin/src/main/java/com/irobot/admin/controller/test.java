package com.irobot.admin.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;
import org.apdplat.qa.SharedQuestionAnsweringSystem;
import org.apdplat.qa.model.CandidateAnswer;
import org.apdplat.qa.model.Question;

import java.util.Date;
import java.util.List;

public class test {

    public static void main(String[] args) {

        String questionStr = "五大洲是哪五个";
        Question question = SharedQuestionAnsweringSystem.getInstance().answerQuestion(questionStr);
        if (question != null) {
            List<CandidateAnswer> candidateAnswers = question.getAllCandidateAnswer();
            int i=1;
            for(CandidateAnswer candidateAnswer : candidateAnswers){
                System.out.println((i++)+"、"+candidateAnswer.getAnswer()+":"+candidateAnswer.getScore());
            }
        }



    }
}
