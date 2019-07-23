package com.irobot.admin.bean;

import lombok.Data;

import java.util.List;

@Data
public class WsOpacResponse {

    private String docNumber;//ID号

    private String bookName;//书名

    private String press;//出版社

    private String content;//内容摘要

    private List<String> label;//主题

    private String typeNo;//中图分类号

    private List<String> author;//作者

    private String isbn;//ISBN

    private List<WsOpacSingleResponse> wsOpacSingleResponseList;//单册

}
