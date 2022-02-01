package guru.springframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	void testHelloWorld() {
		Greeting greet= new Greeting();
		System.out.println(greet.helloWorld());
		
	}

	@Test
	void testHelloWorldString() {
		Greeting greet= new Greeting();
		System.out.println(greet.helloWorld("Amit Mishra"));
	}

}
