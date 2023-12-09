package com.example.demo.Controllers;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@GetMapping("/hello") 
    @ResponseBody
    public String print() {
		return "Hello World";
	}

}
