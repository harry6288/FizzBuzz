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

	@Test
	public void testDivisibleBy3() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(3);
		assertEquals("fizz",result);
	}

}
