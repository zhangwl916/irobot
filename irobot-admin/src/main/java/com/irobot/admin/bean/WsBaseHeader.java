package com.irobot.admin.bean;

import java.io.Serializable;

public class WsBaseHeader<T> implements Serializable {

    private static final long serialVersionUID = 724364358646834612L;

    /**
     * @Author qilg
     * @Description //TODO
     * @Date 14:56 2018/11/14
     * @Param
     * @return {
     * type: feedback //反饋信息
     * source: robot  //輸出源
     * destination：server
     * address：01：02：03
     * token：机器人token
     * module：speech
     * event：speechAnayis
     * sequenceId：  //请求编号
     * data：{
     * question： //问题
     * }
     * }
     **/

    //反饋信息
    private String type;

    //輸出源
    private String source;

    //目的地
    private String destination;

    //硬件地址
    private String address;

    //模块
    private String module;

    //事件
    private String event;

    //请求编号
    private String sequenceId;

    private T data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
