package com.citibank.domain;

public class WhatsappMessage implements Message {

	@Override
	public void sendMessage(String to, String messageText) {
		System.out.println("Sending Whatsapp Message");
		System.out.println("To : " + to);
		System.out.println("Message : " + messageText);
	}

}
