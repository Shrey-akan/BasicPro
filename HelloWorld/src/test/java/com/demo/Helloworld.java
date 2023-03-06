package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;



public class Helloworld {

	@Test
	public void test() {
		Main s = new Main();
		assertEquals("Hello World",s.show());
	}
}
