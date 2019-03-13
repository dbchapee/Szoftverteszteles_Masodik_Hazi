package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Hossz;
import main.InvalidUnitException;
import main.Tomeg;

class HosszTest {

	@Test
	void testLetrehozas() throws InvalidUnitException {
		assertNotNull(new Hossz(50.0, "cm"));
	}
	
	@Test
	void testHasonlitas() throws InvalidUnitException {
		assertEquals(0, (new Hossz(1.0, "km").compareTo(new Hossz(1000.0, "m"))));
	}
	
	@Test
	void testNagyobb() throws InvalidUnitException{
		assertEquals(-1, (new Hossz(1.0, "km").compareTo(new Hossz(1500.0, "m"))) );
	}
}
