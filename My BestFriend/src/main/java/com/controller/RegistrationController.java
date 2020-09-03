package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.friend.api.CommunicationDTO;
import com.friend.api.Phone;
import com.friend.api.UserRegistrationDTO;

@Controller 
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto ) {
		
		System.out.println("inside showRegistrationPage method.");
		
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("8356875656");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		dto.setCommunicationDTO(communicationDTO);
		
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO dto, BindingResult result) {
		
		System.out.println("inside processUserReg method.");
		
		return "registration-success";
	}
	
	
}
