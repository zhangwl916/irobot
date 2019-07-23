package com.irobot.admin.bean;

import lombok.Data;

import java.util.List;

@Data
public class WsOpacUserInfo {

    private String name;//姓名
    private String address0;//地址0
    private String address1;//地址1
    private String email;//邮箱
    private String addressValidStart;//地址有效期起
    private String addressValidEnd;//地址有效期止
    private String postcode;//邮政编码
    private String telephone;//电话
    private String telephone2;//电话2
    private String telephone3;//电话3
    private String telephone4;//电话4
    private String barcode;//条码号
    private String registValidDate;//注册有效期

}
