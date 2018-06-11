package com.nzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ftl")
public class FreemakerController {

	@RequestMapping("center")
	public String center() {
		return "freemarker/center/center";
	}
}
