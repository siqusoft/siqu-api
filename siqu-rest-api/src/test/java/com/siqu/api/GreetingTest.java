package com.siqu.api;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreetingTest {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void TestGreetingMessage()
	{
		String result = new Greeting(0, "Hi Sirak").getContent();
		assertTrue("Hi Sirak" == result);
	}

}