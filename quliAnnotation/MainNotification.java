package com.quliAnnotation;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainNotification {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		UserNotification us = context.getBean(UserNotification.class);
		
		System.out.println(us.getNos1().message());
		System.out.println(us.getNos2().message());
	}
}
