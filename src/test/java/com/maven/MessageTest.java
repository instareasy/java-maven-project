package com.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class MessageTest { 
    
	@Test
	public void testMessageConstructor() {
		Message m1 = new Message();
		Message m2 = new Message();
		assertEquals(m1.getMessage(), m2.getMessage());
	}
	
	@Test
    public void testConstructor() {
        Message message = new Message();
        assertNotNull(message, "Message instance should not be null.");
    }
	
	@Test
    public void testGetMessage() {
        Message message = new Message();
        String expected = "This is the message to be displayed on home page.";
        String actual = message.getMessage();
        assertEquals(expected, actual, "The message should match the expected value.");
    }

}
