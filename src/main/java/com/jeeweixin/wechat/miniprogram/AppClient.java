package com.jeeweixin.wechat.miniprogram;

import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.jeeweixin.common.util.BizDataCrypt;

/**
*@author QiDaCong
*@version 2021-06-10
*微信小程序服务端
**/
public class AppClient {
	
	//登录凭证校验
	public static JSONObject jscode2session(String appid, String appsecret, String code) {
		String url = String.format(AppApi.JSCODE2SESSION, appid, appsecret, code);
		String str = new RestTemplate().getForObject(url, String.class);
		return JSONObject.parseObject(str);
	}
	
	//获取用户的步数
	public static JSONObject getStepList(String appid, String appsecret, String code, String encryptedData, String iv){
		JSONObject jscode = jscode2session(appid, appsecret, code);
		if(jscode.containsKey("session_key")){
			String openid = jscode.getString("openid");
			String sessionkey = jscode.getString("session_key");
			JSONObject returnObj = BizDataCrypt.decrypt(encryptedData, sessionkey, iv);
			if(null != returnObj){
				returnObj.put("openid", openid);
			}
			return returnObj;
		}
		return new JSONObject();
	}
	
}

