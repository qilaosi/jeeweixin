package com.jeeweixin.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
* @author QiCong
* @version 2021年4月11日
**/
@Controller
public class MvcController extends AbstractController{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/")
	public ModelAndView index(HttpServletRequest request){
		logger.info("request index page ....");
		
		return new ModelAndView("index");
	}
	
}

