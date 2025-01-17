package com.quliAnnotation;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements NotificationService {

	@Override
	public String message() {
		
		return "Welcome To Email....";
	}

}
