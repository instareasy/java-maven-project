package com.maven;

public class Message {
	private static final String MESSAGE = "This is the message to be displayed on home page.";
			
	public Message() { }
	
	public static void main(String[] args) {
		System.out.println(MESSAGE);
	}
	
	public String getMessage() {
		return this.MESSAGE;			
	}
}
