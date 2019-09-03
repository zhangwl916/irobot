package com.irobot.admin.controller;

import com.irobot.admin.bean.BorInfo;
import com.irobot.admin.bean.Find;
import com.irobot.admin.bean.ItemData;
import com.irobot.admin.bean.Present;
import com.irobot.admin.utils.HttpClientUtils;
import com.irobot.admin.utils.XSDUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class ParseXmlDemo {

    public static BorInfo getXml() {

        String test = HttpClientUtils.httpGet("http://opac.nlc.cn/F/UNP36X23EJPF8AF1FBKM8D2XVYRQVR24NSDBCFGC97V9CFPBA4-01002?func=find-b&find_code=WRD&request=%E7%BA%A2%E6%A5%BC%E6%A2%A6&local_base=NLC01&filter_code_1=WLN&filter_request_1=&filter_code_2=WYR&filter_request_2=&filter_code_3=WYR&filter_request_3=&filter_code_4=WFM&filter_request_4=&filter_code_5=WSL&filter_request_5=");


        String xml = HttpClientUtils.httpGet("http://localhost:8995/A?op=find&code=wrd&request=art&base=usm01");

        Present find = XSDUtil.converyToJavaBean(xml, Present.class);

        ItemData itemData = XSDUtil.converyToJavaBean(xml, ItemData.class);

        BorInfo borInfo = XSDUtil.converyToJavaBean(xml, BorInfo.class);

        return borInfo;
    }

    public static void main(String[] args) {
        BorInfo find = ParseXmlDemo.getXml();
        System.out.println(find.toString());
    }

}
