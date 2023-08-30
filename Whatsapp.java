package com.jsp.abstraction;

public abstract class Whatsapp extends SocialMedia {


	public void sendMsg() {
		System.out.println("Send msg from available version 1 ");
	}
	
	public void receiveMsg() {
		System.out.println("Receive msg from available version 1");
	}
}
