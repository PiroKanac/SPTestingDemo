package test.springframework;

import org.junit.jupiter.api.*;

class GreetingTest
{
	private Greeting greeting;

	@BeforeAll
	public static void beforeClass(){
		System.out.println("Before!!! - Only called Once!!!");
	}

	@BeforeEach
	void setUp(){
		System.out.println("In Before Each...");
		greeting = new Greeting();
	}

	@Test
	void helloWorld1()
	{
		System.out.println(greeting.helloWorld());
	}

	@Test
	void helloWorld2()
	{
		System.out.println(greeting.helloWorld("Vlaca"));
	}

	@Test
	void helloWorld3()
	{
		System.out.println(greeting.helloWorld("Bro"));
	}

	@AfterEach
	void tearDown(){
		System.out.println("In After Each.....");
	}

	@AfterAll
	public static void afterClass(){
		System.out.println("After!!! ****** - Only called Once!!!");
	}
}
