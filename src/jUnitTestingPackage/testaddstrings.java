package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstrings {

	@Test
	void test() {
		jUnitfunction junitstring = new jUnitfunction();
		String result = junitstring.addString("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
