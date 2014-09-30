package checker;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckDigitTest {

	@Test
	public void test() {
		
		assertTrue("Check is broken, returned false should be true", CheckDigit.Check("4388576018410707") );
		
		assertFalse("Check is broken, returned true should be false", CheckDigit.Check("4246345689049834") );
	}

}
