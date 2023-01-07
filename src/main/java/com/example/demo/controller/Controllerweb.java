package com.example.demo.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Controllerweb {

	
	@GetMapping("/index")
	public String index(Model model) {
		
		
		return "page";
	}
	
	@PostMapping("/post")
	public String post(@RequestParam("p1") String p1,Model model)
	{
		model.addAttribute("P1",p1);

		return "page1";
	}
	
}
