package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumbers {

	@Test
	void test() {
		jUnitfunction junit = new jUnitfunction();
		int result = junit.addNumbers(100, 200);
		
		assertEquals(300,result);
	}

}
