package com.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AssertTest {

	@Test
	public void testeAssertArrayEquals() {
		
		byte[] esperado = "teste".getBytes();
		byte[] atual    = "teste".getBytes();
		assertArrayEquals(esperado, atual);		
	}
	
	@Test
	public void testeAssertEquals() {
		assertEquals("text","text");
	}
	
	@Test
	public void testeAssertFalse() {
		assertFalse(false);
	}
	
	@Test
	public void testAssertNotNull() {
		assertNotNull(new Object());
	}
	
	@Test
	public void testAssertNull() {
		assertNull(null);
	}
	
}
