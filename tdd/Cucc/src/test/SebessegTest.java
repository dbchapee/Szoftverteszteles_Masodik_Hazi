package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import main.Hossz;
import main.InvalidUnitException;
import main.Sebesseg;
import main.Tomeg;
//Ferenczi Kristóf
class SebessegTest {

	@Test
	void testLetrehozas() throws InvalidUnitException {
		assertNotNull(new Sebesseg(50.0, "km/h"));
	}
	
	@Test
	void testLetrehoza2s() throws InvalidUnitException {
		assertNotNull(new Sebesseg(510.0, "m/s"));
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	
	@Test
	void testSebessegHibaDobas() throws InvalidUnitException {
		assertThrows(InvalidUnitException.class, () ->  new Sebesseg(150.0, "m/h"));
		
	}
	
	
}
