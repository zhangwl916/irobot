package com.irobot.admin.bean;

import java.io.Serializable;

/**
 * 公共响应类
 * @author G_G 
 *
 * @param <T> 响应数据类型
 */
public class ResponseModel<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private int code; //状态码
	private String msg;//状态说明
	private T data; //响应数据
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
		this.msg = ERROR_CODE.getEnumMsg(code);
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@SuppressWarnings("rawtypes")
	public static ResponseModel SYSTEM_ERROR() {
		ResponseModel result = new ResponseModel();
		result.setCode(ERROR_CODE.SYSTEM_ERROR.getCode());
		return result;
	}
	public static <T>ResponseModel<T> SYSTEM_ERROR(T t) {
		ResponseModel<T> result = new ResponseModel<T>();
		result.setCode(ERROR_CODE.SYSTEM_ERROR.getCode());
		result.setData(t);
		return result;
	}
	@SuppressWarnings("rawtypes")
	public static ResponseModel SUCCESS() {
		ResponseModel result = new ResponseModel();
		result.setCode(ERROR_CODE.SUCCESS.getCode());
		return result;
	}
	public static <T>ResponseModel<T> SUCCESS(T t) {
		ResponseModel<T> result = new ResponseModel<T>();
		result.setCode(ERROR_CODE.SUCCESS.getCode());
		result.setData(t);
		return result;
	}
}
