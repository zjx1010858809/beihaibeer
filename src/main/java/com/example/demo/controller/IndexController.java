package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	//进入首页
	@RequestMapping("index")
	public String index(){
		
		return "index";
	}
	//进入产品介绍界面
	@RequestMapping("about")
	public String about(){
			
		return "about";
	}
	//进入图片展示界面
	@RequestMapping("gallery1")
	public String gallery1(){
	
		return "gallery1";
	}
	@RequestMapping("gallery21")
	public String gallery21(){
	
		return "gallery21";
	}
	@RequestMapping("gallery22")
	public String gallery22(){
	
		return "gallery22";
	}
	//进入联系我们界面
	@RequestMapping("contact")
	public String contact(){
	  
		return "contact";
	}

}
