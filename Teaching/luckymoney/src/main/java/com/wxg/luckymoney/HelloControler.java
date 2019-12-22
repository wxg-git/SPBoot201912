package com.wxg.luckymoney;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler
{
	
	/*
	//(一个一个读取的话太麻烦，使用一个对象，与配置映射) 
	 
	// 读取配置文件yml中的minMoney配置的值
	@Value("${minMoney}")
	private BigDecimal minMoney;
	
	@Value("${description}")
	private String description; 
	
	
	@RequestMapping("/hello")
	public String say()
	{
		return "minMoney:" + minMoney + "description:" + this.description;
	}
	*/
	
	@Autowired
	private LimitConfig limitConfig;
	
	@RequestMapping("/hello")
	public String say()
	{
		return "minMoney:" + limitConfig.getMinMoney() + "description:" + limitConfig.getDescription();
	}

}
