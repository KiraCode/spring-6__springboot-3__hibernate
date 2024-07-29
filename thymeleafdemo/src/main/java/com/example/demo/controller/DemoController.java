package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("theDate", LocalDate.now());
		return "helloworld";
	}
}
