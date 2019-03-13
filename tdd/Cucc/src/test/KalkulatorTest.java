package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import main.Hossz;
import main.Hajo;
import main.Sebesseg;
import main.Tomeg;

class KalkulatorTest {
	
	private Kalculator k;

	@BeforeClass
	public static void seupBeforeClass() throws Exception {
		Tomeg w = new Tomeg(10000.0, "t");
		Hossz length = new Hossz(120.0, "m");
		Sebesseg s = new Sebesseg(5.0, "m/s");
		Hajo ship = new Hajo(w, length, s);
		Pozicio p = new Pozicio();
	}
	
	@Test
	void test() {
		Tomeg w = new Tomeg(8000.0, "t");
		Hossz length = new Hossz(100.0, "m");
		Sebesseg s = new Sebesseg(5.0, "m/s");
		Hajo otherShip = new Hajo(w, length, s);
		Pozicio p = new Pozicio();
		int angle = 270;
		assertEquals("Lassíts!", k.gonnaCrashTo(otherShip, p, angle));
		;
	}

}
