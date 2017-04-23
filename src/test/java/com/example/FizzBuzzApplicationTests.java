package com.example;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest
public class FizzBuzzApplicationTests {

	@Test
	public void t01_it_should_return_1_when_input_1() {
		FizzBuzzApplication fizzBuzzApplication = new FizzBuzzApplication();
		String result = fizzBuzzApplication.calculate(1);
		Assert.assertEquals("1",result);
	}

	@Test
	public void t02_it_should_return_Fizz_when_input_3() {
		FizzBuzzApplication fizzBuzzApplication = new FizzBuzzApplication();
		String result = fizzBuzzApplication.calculate(3);
		Assert.assertEquals("Fizz",result);
	}

	@Test
	public void t03_it_should_return_Fizz_when_input_6() {
		FizzBuzzApplication fizzBuzzApplication = new FizzBuzzApplication();
		String result = fizzBuzzApplication.calculate(6);
		Assert.assertEquals("Fizz",result);
	}

	@Test
	public void t04_it_should_return_Buzz_when_input_5() {
		FizzBuzzApplication fizzBuzzApplication = new FizzBuzzApplication();
		String result = fizzBuzzApplication.calculate(5);
		Assert.assertEquals("Buzz",result);
	}

	@Test
	public void t05_it_should_return_Buzz_when_input_10() {
		FizzBuzzApplication fizzBuzzApplication = new FizzBuzzApplication();
		String result = fizzBuzzApplication.calculate(10);
		Assert.assertEquals("Buzz",result);
	}

	@Test
	public void t06_it_should_return_FizzBuzz_when_input_15() {
		FizzBuzzApplication fizzBuzzApplication = new FizzBuzzApplication();
		String result = fizzBuzzApplication.calculate(15);
		Assert.assertEquals("FizzBuzz",result);
	}


	@Test
	public void t07_it_should_return_FizzBuzz_when_input_30() {
		FizzBuzzApplication fizzBuzzApplication = new FizzBuzzApplication();
		String result = fizzBuzzApplication.calculate(30);
		Assert.assertEquals("FizzBuzz",result);
	}
}
