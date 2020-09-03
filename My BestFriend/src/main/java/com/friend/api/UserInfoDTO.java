package com.friend.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	@NotBlank(message="{String.notEmpty}")
	@Size(min= 3, max=20, message= "*Your name should have char between 3-20")
	private String userName;
	
	@NotBlank(message="*Your Name cannot be blank")
	@Size(min= 3, max=20, message= "*Your name should have char between 3-20")
	private String crushName;
	
	@AssertTrue(message="*You have to agree to the terms and condition")
	private boolean termAndCondition;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + ", termAndCondition="
				+ termAndCondition + "]";
	}
	
	
	
 
}
