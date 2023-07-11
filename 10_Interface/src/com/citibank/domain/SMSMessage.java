package com.citibank.domain;

public class SMSMessage implements Message {

	@Override
	public void sendMessage(String to, String messageText) {
		System.out.println("Sending SMS Message");
		System.out.println("To : " + to);
		System.out.println("Message : " + messageText);
	}

}
