package com.jorgemartinez.AppCompraVenta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
	/*
	@GetMapping({"/","/index"})
		public String index() {
			return "index";
		}*/
	
	@RequestMapping(value = "/newAccount", method = RequestMethod.GET)
    public String newAccount() {
    System.out.println("hello");
    return "register";
}
}
