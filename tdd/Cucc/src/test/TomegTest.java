package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import main.InvalidUnitException;
import main.Tomeg;

class TomegTest {

	@Test
	void testLetrehozas() throws InvalidUnitException {
		assertNotNull(new Tomeg(1.0, "kg"));
	}

	@Test
	void testHasonlitas() throws InvalidUnitException {
		assertEquals(0, (new Tomeg(1.0, "kg").compareTo(new Tomeg(1.0, "kg"))));
	}
	
	@Test
	void testNagyobb() {
		try {
			assertEquals(1, (new Tomeg(100.0, "kg").compareTo(new Tomeg(10.0, "kg"))) );
		} catch (InvalidUnitException e) {
			e.printStackTrace();
		}
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	
	@Test
	void testMertekEgyseghibadobas() throws InvalidUnitException {
		assertThrows(InvalidUnitException.class, () -> new Tomeg(100.0, "asd"));
		
	}
	
	
	
}
