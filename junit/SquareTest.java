package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testSquare() {
		Square s = new Square();
		int result = s.square(5);
		assertEquals(25, result);
	}

}
