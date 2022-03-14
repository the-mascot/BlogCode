package com.example.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class I18nController {
	
	@GetMapping("/")
	public String test() {
		return "index";
	}
	
}
