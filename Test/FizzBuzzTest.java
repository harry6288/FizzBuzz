import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//r1
	@Test
	public void testDivisibleBy3() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(27);
		assertEquals("fizz",result);
	}
	//r2
	@Test
	public void testDivisibleBy5() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(10);
		assertEquals("buzz",result);
	}
	//r3
	@Test
	public void testDivisibleBy3and5() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(15);
		assertEquals("fizzbuzz",result);
	}
	//r4
	@Test
	public void testOtherNumber() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(4);
		assertEquals("4",result);
	}
	//r5
	@Test
	public void testPrimeNumber() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(11);
		assertEquals("whizz",result);
	}
	

}
