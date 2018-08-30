package com.neusoft.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/left")
public class TeamBuyLeft {
	
	@RequestMapping(value="/ul/{id}")
	public String goshopping(@PathVariable("id") int id,RedirectAttributes response) {
		response.addAttribute("type",id);
		return "redirect:/shopping/type/8/1";
	}

}
