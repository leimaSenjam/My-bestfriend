package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.friend.api.UserInfoDTO;

@Controller 
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userinfodto ) {
		
	
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfodto, BindingResult result ) {
		
		if (result.hasErrors()) {
			
	        List<ObjectError> allErrors =result.getAllErrors();
		      for(ObjectError temp: allErrors) {
		    	System.out.println("my form has error");
		    }
		
		return "home-page";
		
		
	}
	
		return "result-page";
	}
	
	
	

}
