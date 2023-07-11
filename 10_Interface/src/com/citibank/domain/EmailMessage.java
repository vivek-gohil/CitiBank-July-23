package com.citibank.domain;

public class EmailMessage implements Message {

	@Override
	public void sendMessage(String to, String messageText) {
		System.out.println("Sending Email Message");
		System.out.println("To : " + to);
		System.out.println("Message : " + messageText);
	}

}
