package com.jeeweixin.common.util;

import com.alibaba.fastjson.JSONObject;

public class JsonView {
	
	public static final Integer SUCCESS_CODE = 0;//成功
	public static final Integer FAILURE_CODE = 1;//失败
	
	public static String successJson(Object data){
		JSONObject resultJson = new JSONObject();
		resultJson.put("errcode", SUCCESS_CODE);
		resultJson.put("data", data);
		return resultJson.toJSONString();
	}
	
	public static String successJson(String message) {
		JSONObject resultJson = new JSONObject();
		resultJson.put("errcode", SUCCESS_CODE);
		resultJson.put("message", message);
		return resultJson.toJSONString();
	}
	
	public static String successJson() {
		JSONObject resultJson = new JSONObject();
		resultJson.put("errcode", SUCCESS_CODE);
		return resultJson.toJSONString();
	}
	
	public static String failureJson(String message){
		JSONObject resultJson = new JSONObject();
		resultJson.put("errcode", FAILURE_CODE);
		resultJson.put("message", message);
		return resultJson.toJSONString();
	}
	
	public static String renderJson(Integer errcode, Object data) {
		JSONObject resultJson = new JSONObject();
		resultJson.put("errcode", errcode);
		resultJson.put("data", data);
		return resultJson.toJSONString();
	}
	
	public static String renderJson(Integer errcode) {
		JSONObject resultJson = new JSONObject();
		resultJson.put("errcode", errcode);
		return resultJson.toJSONString();
	}
	
	public static String renderJson(JSONObject jsObj) {
		if(null == jsObj) {
			return failureJson("未知错误");
		}
		JSONObject resultJson = new JSONObject();
		resultJson.put("errcode", jsObj.getInteger("errcode"));
		resultJson.put("message", jsObj.getString("errmsg"));
		resultJson.put("data", jsObj);
		return resultJson.toJSONString();
	}
	
}
