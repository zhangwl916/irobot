package com.irobot.admin.bean;
/**
 * 状态码
 * @author G_G
 */
public enum ERROR_CODE {
	FAIL(-1,"未知异常"),
	/************200:成功*************/
	SUCCESS(200,"成功"),
	NOT_DATA(201,"查询无数据"),
	SAVE_ERROR(202,"申请失败"),
	NOT_NUMBER(203,"抱歉，您的{service_name}服务次数已用完，需等到第二个会籍年才可以恢复服务次数"),
	NOT_ROLE(204,"权限不够"),
	NOT_POWER(205,"抱歉,{level}(含)以上会员才可享受我司{service_name}服务。"),
	EXCEED_TIME(206,"您的会员已过期"),
	
	OVERSTEP_ROLE(210,"您是我司高级会员,我司为您准备了高端体检服务,立即前往?"),
	/*************400+:参数级异常*************/
	NOT_PARAM(400,"缺少必要参数"),
	NOT_EXIST(401,"对象不存在"),
	NOT_REDEEMCODE(405,"亲，礼宾车服务兑换码库存告急，服务专员正快马加鞭为您备货。如有紧急需求，请致电我司热线95354申请。谢谢！"),
	WRONG_INPUT(406,"错误输入"),
	
	
	/*************500+:系统级异常**************/
	SYSTEM_ERROR(500,"系统异常"),
	SYSTEM_TIMEOUT(300,"系统超时"),
	SIGN_ERROR(501,"验签失败"),
	
	
	
	
	/**************900+:其他异常******************/
	P_ERROR(999,"跑批失败");
	private int code;
	private String msg;
	
	ERROR_CODE(int code,String msg){
		this.code = code;
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public static String getEnumMsg(int code) {
        for (ERROR_CODE ec : ERROR_CODE.values()) {
            if (code == ec.getCode()) {
                return ec.getMsg();
            }
        }
        return null;
    }
}
