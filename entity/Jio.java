package com.entity;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim{

	public String calling() {
		return " U R calling form Jio";
	}
}
