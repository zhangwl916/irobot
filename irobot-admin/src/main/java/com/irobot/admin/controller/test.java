package com.irobot.admin.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import com.irobot.admin.utils.HttpClientUtils;
import org.apdplat.qa.SharedQuestionAnsweringSystem;
import org.apdplat.qa.model.CandidateAnswer;
import org.apdplat.qa.model.Question;

import java.util.Date;
import java.util.List;

public class test {

    public static void main(String[] args) {

        String number="63002434";

        String str = HttpClientUtils.httpGet("https://wxdat.soochowlife.net/agentwap/Skip/searchByAccountNo.do?agentCode=" + number);

        System.out.println(str);

        JSONObject jsonObject = JSONObject.parseObject(str);

        String name=jsonObject.getString("name");

        System.out.println(name);


    }
}
