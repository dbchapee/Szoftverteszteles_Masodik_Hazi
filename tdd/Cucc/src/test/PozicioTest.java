package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.InvalidUnitException;
import main.Pozicio;
import main.Tomeg;

class PozicioTest {
	
	@Test
	void test_for_when_the_irany_is_bigger_then_360() throws InvalidUnitException{
		assertThrows(InvalidUnitException.class, () -> new Pozicio(0, 0, 700));
	}
	
	@Test
	void test_for_when_the_irany_is_lower_then_0() throws InvalidUnitException{
		assertThrows(InvalidUnitException.class, () -> new Pozicio(0, 0, -700));
	}
	
	@Test
	void test_helyes_intervallum() throws InvalidUnitException{
		int irany = 20;
		Pozicio p = new Pozicio(0, 0, irany);
		
		assertEquals(irany, p.getIrany());
	}

}
