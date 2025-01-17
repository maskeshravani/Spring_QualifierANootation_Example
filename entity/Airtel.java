package com.entity;

import org.springframework.stereotype.Component;

@Component("air")
public class Airtel implements Sim{

	public String calling() {
		return " U R calling form Airtel";
	}
}
