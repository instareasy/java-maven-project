package com.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MessageTest {
	
	@Test
	public void testMessageConstructor() {
		Message m1 = new Message();
		Message m2 = new Message();
		assertEquals(m1.getMessage(), m2.getMessage());
	}
	
	
	@Test
	public void testMessageContent() {
		Message m = new Message();
		assertEquals("This is the message to be displayed on home page.", m.getMessage());
	}

}
