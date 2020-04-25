package com.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class AppController {
	
	@RequestMapping("/showPage")
	public String showPage()
	{
		return "register";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute("product") Product product,ModelMap modelMap)
	{
		String uri="http://localhost:8088/products";
		RestTemplate restTemplate=new RestTemplate();
		Product savedProduct=restTemplate.postForObject(uri,product,Product.class);
		modelMap.addAttribute("msg","Product is added successful"+savedProduct.getId());
		return "register";
		
	}

}
