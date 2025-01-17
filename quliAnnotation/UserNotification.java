package com.quliAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserNotification {

	@Qualifier("email")
	@Autowired
	private NotificationService nos1;

	@Qualifier("sms")
	@Autowired
	private NotificationService nos2;

	public NotificationService getNos1() {
		return nos1;
	}

	public void setNos1(NotificationService nos1) {
		this.nos1 = nos1;
	}

	public NotificationService getNos2() {
		return nos2;
	}

	public void setNos2(NotificationService nos2) {
		this.nos2 = nos2;
	}

	@Override
	public String toString() {
		return "UserNotification [nos1=" + nos1 + ", nos2=" + nos2 + "]";
	}

}
