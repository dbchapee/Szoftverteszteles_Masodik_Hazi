package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import main.Hossz;
import main.InvalidUnitException;
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
		Pozicio p = new Pozicio(0, 0);
		Hajo ship = new Hajo(w, length, s, p);
	}
	
	@Test
	void test() throws Exception {
		Tomeg ourship_t = new Tomeg(2000, "kg");
		Hossz ourship_h = new Hossz(500, "m");
		Sebesseg ourship_s = new Sebesseg(50.0, "km/h");
		Pozicio ourship_p = new Pozicio(0, 0);
		Hajo ourship = new Hajo(ourship_t, ourship_h, ourship_s, ourship_p);
		
		Tomeg theirship_t = new Tomeg(3000, "kg");
		Hossz theirship_h = new Hossz(750, "m");
		Sebesseg theirship_s = new Sebesseg(60.0, "km/h");
		Pozicio theirship_p = new Pozicio(0, 0);
		Hajo theirship = new Hajo(theirship_t, theirship_h, theirship_s, theirship_p);
		assertEquals(1, k.are_we_gonnaCrashTo(ourship, theirship));
	}
	
	
	@Test
	//gulyas_g
	void testing_for_when_we_dont_have_to_do_anything() throws Exception{
		Tomeg ourship_t = new Tomeg(2000, "kg");
		Hossz ourship_h = new Hossz(500, "m");
		Sebesseg ourship_s = new Sebesseg(50.0, "km/h");
		Pozicio ourship_p = new Pozicio(0, 0);
		Hajo ourship = new Hajo(ourship_t, ourship_h, ourship_s, ourship_p);
		
		Tomeg theirship_t = new Tomeg(3000, "kg");
		Hossz theirship_h = new Hossz(750, "m");
		Sebesseg theirship_s = new Sebesseg(60.0, "km/h");
		Pozicio theirship_p = new Pozicio(0, 0);
		Hajo theirship = new Hajo(theirship_t, theirship_h, theirship_s, theirship_p);
		
		assertEquals(1, k.are_we_gonnaCrashTo(ourship, theirship));
	}
	
	@Test
	//gulyas_g
	void testing_for_when_we_have_to_slow_down() throws Exception{
		
		
		//assertEquals(1, k.are_we_gonnaCrashTo(ourship, theirship));
	}
	
	@Test
	void testKeresztezikEgymast() throws Exception {
		Tomeg t = new Tomeg(2000, "kg");
		Tomeg t2 = new Tomeg(2000, "kg");
		Hossz h = new Hossz(500, "m");
		Hossz h2 = new Hossz(500, "m");
		Sebesseg s = new Sebesseg(50.0, "km/h");
		Sebesseg s2 = new Sebesseg(50.0, "km/h");
		Pozicio p = new Pozicio(2, 4);
		Pozicio p2 = new Pozicio(2, 8);
		boolean ker = k.keresztezikEgymast(new Hajo(t, h, s, p), new Hajo(t2, h2, s2, p2));
		assertTrue(ker);
	}
	
	@Test
	void testHolKeresztezikEgymast() throws Exception {
		Tomeg t = new Tomeg(2000, "kg");
		Tomeg t2 = new Tomeg(2000, "kg");
		Hossz h = new Hossz(500, "m");
		Hossz h2 = new Hossz(500, "m");
		Sebesseg s = new Sebesseg(50.0, "km/h");
		Sebesseg s2 = new Sebesseg(50.0, "km/h");
		Pozicio p = new Pozicio(5, 5);
		Pozicio p2 = new Pozicio(0, 13);
		Pozicio kozosPont = k.getMetszesPont(new Hajo(t, h, s, p), new Hajo(t2, h2, s2, p2));
		assertTrue(kozosPont.getX() == 0 && kozosPont.getY() == 4);
	}

}
