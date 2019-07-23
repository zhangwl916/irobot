package com.irobot.admin.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;

import java.util.Date;

public class test {

    public static void main(String[] args) {

        Date date = DateUtil.date();

        System.out.println(date);


        String result1= HttpUtil.get("https://www.baidu.com");



    }
}
