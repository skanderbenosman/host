package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PreLoginController {

 

	  @GetMapping(value="/")
		public String registration3(){
			return "aaaa2333";}
			

}