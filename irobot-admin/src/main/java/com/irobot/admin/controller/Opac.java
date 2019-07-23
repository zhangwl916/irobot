package com.irobot.admin.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.irobot.admin.bean.*;
import com.irobot.admin.utils.HttpClientUtils;
import com.irobot.admin.utils.XSDUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.apache.commons.lang.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Opac {

    public static void main(String[] args) {


        long startime = System.currentTimeMillis();
        WsBaseHeader wsBaseHeader = new WsBaseHeader();
        WsBaseHeader wsBaseHeaderresponse = new WsBaseHeader();
        wsBaseHeaderresponse.setAddress(wsBaseHeader.getAddress());
        wsBaseHeaderresponse.setDestination(wsBaseHeader.getSource());
        wsBaseHeaderresponse.setSource(wsBaseHeader.getDestination());
        wsBaseHeaderresponse.setEvent(wsBaseHeader.getEvent());
        wsBaseHeaderresponse.setSequenceId(wsBaseHeader.getSequenceId());
        wsBaseHeaderresponse.setModule("speech");


        Map<String, String> map = new HashMap<>();
        map.put("question", "找下红楼梦这本书");
        wsBaseHeader.setData(map);


        wsBaseHeaderresponse.setType("ANSWER");


//        WsVoiceRequest wsVoiceRequest = JSON.toJavaObject((JSONObject) wsBaseHeader.getData(), WsVoiceRequest.class);
//        String question = wsVoiceRequest.getQuestion();

//        String question = "红楼梦";
//
//        JSONObject jsonObject=JSONObject.parseObject(question);

        JSONObject questiontext = HttpClientUtils.httpPost("http://192.168.1.114:8000/library", (JSONObject) wsBaseHeader.getData());

        String jsonStr = JSONObject.toJSONString(questiontext);


        String xml = null;
        try {
            xml = HttpClientUtils.httpGet("http://localhost:8995/X?op=find&code=wrd&request=" +
                    URLEncoder.encode(jsonStr, "UTF-8") + "&base=usm01");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Document document = null;
        try {
            document = DocumentHelper.parseText(xml);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        Element root = document.getRootElement();

        String error = root.elementText("error");

        if (StringUtils.isEmpty(error)) {

//            String setNumber = root.elementText("set_number");
            String setNumber = "000015";
            String url = HttpClientUtils.httpGet("http://localhost:8995/Y?op=present&set_entry=000000001-000000003&" +
                    "set_number=" + setNumber + "&base=nlc01");

            Present present = XSDUtil.converyToJavaBean(url, Present.class);

            List<WsOpacResponse> list = new ArrayList<WsOpacResponse>();


            if (present != null) {
                List<Present.Record> recordList = present.getRecord();
                if (recordList != null && recordList.size() > 0) {
                    for (Present.Record record : recordList) {

                        WsOpacResponse wsOpacResponse = new WsOpacResponse();

                        String docNumber = record.getDocNumber();

                        List<Present.Record.Metadata.OaiMarc.Varfield> varfieldList = record.getMetadata().getOaiMarc().getVarfield();

                        List<String> authorList = new ArrayList<>();

                        if (varfieldList != null && varfieldList.size() > 0) {

                            for (Present.Record.Metadata.OaiMarc.Varfield varfield : varfieldList) {

                                String varfieldId = varfield.getId();

                                List<Present.Record.Metadata.OaiMarc.Varfield.Subfield> subfieldList = varfield.getSubfield();

                                //取主题
                                List<String> labelList = new ArrayList<>();


                                if (subfieldList != null && subfieldList.size() > 0) {

                                    for (Present.Record.Metadata.OaiMarc.Varfield.Subfield subfield : subfieldList) {

                                        String label = subfield.getLabel();

                                        //取主题
                                        if ("606".equals(varfieldId)) {
                                            String subfieldValue = subfield.getValue();
                                            labelList.add(subfieldValue);
                                            wsOpacResponse.setLabel(labelList);
                                        }

                                        //取作者
                                        if ("701".equals(varfieldId) && "a".equals(label)) {
                                            String subfieldValue = subfield.getValue();
                                            authorList.add(subfieldValue);
                                            wsOpacResponse.setAuthor(authorList);
                                        }

                                        //取书名  varfield的ID为200 subfield的label为a
                                        if ("200".equals(varfieldId) && "a".equals(label)) {

                                            String bookName = subfield.getValue();

                                            if (StringUtils.isNotEmpty(bookName)) {

                                                wsOpacResponse.setBookName(bookName);

                                            }

                                        }


                                        //取出版社 varfield的ID为210 subfield的label为c
                                        if ("210".equals(varfieldId) && "c".equals(label)) {

                                            String press = subfield.getValue();

                                            if (StringUtils.isNotEmpty(press)) {

                                                wsOpacResponse.setPress(press);

                                            }

                                        }

                                        //取ISBN varfield的ID为010 subfield的label为a
                                        if ("010".equals(varfieldId) && "a".equals(label)) {

                                            String isbn = subfield.getValue();

                                            if (StringUtils.isNotEmpty(isbn)) {

                                                wsOpacResponse.setIsbn(isbn);

                                            }

                                        }

                                        //取内容摘要 varfield的ID为330 subfield的label为a
                                        if ("330".equals(varfieldId) && "a".equals(label)) {

                                            String content = subfield.getValue();

                                            if (StringUtils.isNotEmpty(content)) {

                                                wsOpacResponse.setContent(content);

                                            }

                                        }

                                        //取中图分类号 varfield的ID为690 subfield的label为a
                                        if ("690".equals(varfieldId) && "a".equals(label)) {

                                            String typeNo = subfield.getValue();

                                            if (StringUtils.isNotEmpty(typeNo)) {

                                                wsOpacResponse.setTypeNo(typeNo);

                                            }

                                        }

                                    }


                                }


                            }

                        }


                        if (StringUtils.isNotEmpty(docNumber)) {

                            wsOpacResponse.setDocNumber(docNumber);
                        }


                        //单册信息
//                        String single = HttpClientUtils.httpGet("http://localhost:8995/X?item-data&doc_number="+docNumber+
//                                "&base=nlc01&USER_NAME=WWW-TYQ&USER_PASSWORD=PWDTYQ&");

                        String single = HttpClientUtils.httpGet("http://localhost:8995/Z?op=find&code=wrd&request=art&base=usm01");

                        ItemData itemData = XSDUtil.converyToJavaBean(single, ItemData.class);


                        //根据单册代码取值
                        if (itemData != null) {

                            List<ItemData.Item> itemList = itemData.getItem();

                            List<WsOpacSingleResponse> wsOpacSingleResponseList = new ArrayList<>();

                            if (itemList != null && itemList.size() > 0) {
                            }

                            for (ItemData.Item item : itemList) {

                                WsOpacSingleResponse wsOpacSingleResponse = new WsOpacSingleResponse();

                                byte itemStatus = item.getItemStatus();
                                String subLibrary = item.getSubLibrary();
                                long barcode = item.getBarcode();

                                wsOpacSingleResponse.setStatus(String.valueOf(itemStatus));
                                wsOpacSingleResponse.setSubLibrary(subLibrary);
                                wsOpacSingleResponse.setBarcode(String.valueOf(barcode));

                                wsOpacSingleResponseList.add(wsOpacSingleResponse);
                            }


                            wsOpacResponse.setWsOpacSingleResponseList(wsOpacSingleResponseList);

                        }
                        list.add(wsOpacResponse);

                    }
                }
            }


            wsBaseHeader.setData(list);

        }

        System.out.println(wsBaseHeader);

    }

}
