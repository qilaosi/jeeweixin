package com.jeeweixin.web.api.miniprogram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jeeweixin.common.util.JsonView;
import com.jeeweixin.wechat.WechatConfig;
import com.jeeweixin.wechat.miniprogram.AppClient;
/**
* @author git@qidacong
* @version 2021年4月11日
**/

@Controller
@RequestMapping("/api/miniprogram")
public class AppController{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * 获取加密打卡数据
	 */
	@PostMapping(value = "/encryptStepInfoData")
	@ResponseBody
	public String encryptStepInfoData(String encryptedData, String iv, String code) {
		JSONObject stepObj = AppClient.encryptStepInfo(WechatConfig.mappid, WechatConfig.mappsecret, code, encryptedData, iv);
		return JsonView.successJson(stepObj);
	}
	
}

