package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import main.Hossz;
import main.Kalculator;
import main.Pozicio;
import main.Hajo;
import main.Sebesseg;
import main.Tomeg;

class KalkulatorTest {
	
	public KalkulatorTest() {
		// TODO Auto-generated constructor stub
	}
	
	private Kalculator k = new Kalculator();


	public static void seupBeforeClass() throws Exception {
		Tomeg w = new Tomeg(10000.0, "t");
		Hossz length = new Hossz(120.0, "m");
		Sebesseg s = new Sebesseg(5.0, "m/s");
		Hajo ship = new Hajo(w, length, s);
		Pozicio p = new Pozicio();
	}
	

	void test() {
		Tomeg w = new Tomeg(8000.0, "t");
		Hossz length = new Hossz(100.0, "m");
		Sebesseg s = new Sebesseg(5.0, "m/s");
		Hajo otherShip = new Hajo(w, length, s);
		Pozicio p = new Pozicio();
		int angle = 270;
		assertEquals("Lassíts!", k.gonnaCrashTo(otherShip, p, angle));
	}
	
	
	@Test
	//gulyas_g
	void testing_for_when_we_dont_have_to_do_anything() throws Exception{
		//todo make the class Hajo konstruktor with pozicio
		Tomeg ourship_t = new Tomeg(2000, "kg");
		Hossz ourship_h = new Hossz(500, "m");
		Sebesseg ourship_s = new Sebesseg(50.0, "km/h");
		Pozicio ourship_p = new Pozicio(0, 0, 0);
		Hajo ourship = new Hajo(ourship_t, ourship_h, ourship_s, ourship_p);
		
		Tomeg theirship_t = new Tomeg(3000, "kg");
		Hossz theirship_h = new Hossz(750, "m");
		Sebesseg theirship_s = new Sebesseg(60.0, "km/h");
		Pozicio theirship_p = new Pozicio(0, 0, 0);
		Hajo theirship = new Hajo(theirship_t, theirship_h, theirship_s, theirship_p);
		
		assertEquals(1, k.are_we_gonnaCrashTo(ourship, theirship));
	}
	
	@Test
	//gulyas_g
	void testing_for_when_we_have_to_slow_down() throws Exception{
		
		
		//assertEquals(1, k.are_we_gonnaCrashTo(ourship, theirship));
	}

}
