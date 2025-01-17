package com.quliAnnotation;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotification implements NotificationService{

	@Override
	public String message() {
		
		return "Welcome to SMS.....";
	}

}
