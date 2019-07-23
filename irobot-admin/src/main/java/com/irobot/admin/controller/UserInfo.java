package com.irobot.admin.controller;

import com.irobot.admin.bean.BorInfo;
import com.irobot.admin.bean.WsBaseHeader;
import com.irobot.admin.bean.WsOpacUserInfo;
import com.irobot.admin.utils.HttpClientUtils;
import com.irobot.admin.utils.XSDUtil;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {


    public static void main(String[] args) {

        WsBaseHeader wsBaseHeader = new WsBaseHeader();
        WsBaseHeader wsBaseHeaderresponse = new WsBaseHeader();
        wsBaseHeaderresponse.setAddress(wsBaseHeader.getAddress());
        wsBaseHeaderresponse.setDestination(wsBaseHeader.getSource());
        wsBaseHeaderresponse.setSource(wsBaseHeader.getDestination());
        wsBaseHeaderresponse.setEvent(wsBaseHeader.getEvent());
        wsBaseHeaderresponse.setSequenceId(wsBaseHeader.getSequenceId());
        wsBaseHeaderresponse.setModule("speech");


        wsBaseHeaderresponse.setType("ANSWER");

        String idcard = "320111111";

        String xml = HttpClientUtils.httpGet("http://localhost:8995/A?op=find&code=wrd&request=art&base=usm01");

        BorInfo borInfo = XSDUtil.converyToJavaBean(xml, BorInfo.class);

        List<WsOpacUserInfo> list = new ArrayList<>();

        if (borInfo != null) {

            WsOpacUserInfo wsOpacUserInfo = new WsOpacUserInfo();

            //姓名
            if (StringUtils.isNotEmpty(borInfo.getZ303().getZ303Name())) {

                wsOpacUserInfo.setName(borInfo.getZ303().getZ303Name());
            }

            //注册有效期
            if (StringUtils.isNotEmpty(borInfo.getZ305().getZ305ExpiryDate())) {
                wsOpacUserInfo.setRegistValidDate(borInfo.getZ305().getZ305ExpiryDate());
            }

            BorInfo.Z304 z304 = borInfo.getZ304();

            if (z304 != null) {

            //邮箱
            if (StringUtils.isNotEmpty(z304.getZ304EmailAddress())) {
                wsOpacUserInfo.setEmail(z304.getZ304EmailAddress());
            }


            //地址0
            if (StringUtils.isNotEmpty(z304.getZ304Address0())) {
                wsOpacUserInfo.setAddress0(z304.getZ304Address0());
            }

            //地址1
            if (StringUtils.isNotEmpty(z304.getZ304Address1())) {
                wsOpacUserInfo.setAddress1(z304.getZ304Address1());
            }

            //电话
            if (StringUtils.isNotEmpty(z304.getZ304Telephone())) {
                wsOpacUserInfo.setTelephone(z304.getZ304Telephone());
            }

            //电话2
            if (StringUtils.isNotEmpty(z304.getZ304Telephone2())) {
                wsOpacUserInfo.setTelephone2(z304.getZ304Telephone2());
            }

            //电话3
            if (StringUtils.isNotEmpty(z304.getZ304Telephone3())) {
                wsOpacUserInfo.setTelephone3(z304.getZ304Telephone3());
            }

            //电话4
            if (StringUtils.isNotEmpty(z304.getZ304Telephone4())) {
                wsOpacUserInfo.setTelephone4(z304.getZ304Telephone4());
            }

        }

            list.add(wsOpacUserInfo);

        }


        wsBaseHeader.setData(list);

        System.out.println(wsBaseHeader);


    }
}
