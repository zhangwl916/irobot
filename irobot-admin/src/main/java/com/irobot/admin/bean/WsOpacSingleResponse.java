package com.irobot.admin.bean;

import lombok.Data;

@Data
public class WsOpacSingleResponse {

    private String status;//单册状态

    private String callNumber;//索取号

    private String returnDate;//应还日期

    private String returnTime;//应还时间

    private String subLibrary;//子库

    private String location;//图书位置

    private String barcode;//条码


}
