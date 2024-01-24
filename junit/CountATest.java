package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		Square s2= new Square();
		int result = s2.countA("Akanksha");
		assertEquals(3, result);
	}

}
