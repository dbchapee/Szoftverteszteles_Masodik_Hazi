package main;

public class Sebesseg {
	
	private double sebesseg;
	
	public Sebesseg(double sebesseg, String mertekEgyseg) throws InvalidUnitException {
		if (mertekEgyseg.equals("m/s")) this.sebesseg = sebesseg;
		else if (mertekEgyseg.equals("km/h")) this.sebesseg = sebesseg*3.6;
		else if (mertekEgyseg.equals("mi/h")) this.sebesseg = sebesseg*0.44704;
		else if (mertekEgyseg.equals("knot")) this.sebesseg = sebesseg*0.514444444;
		else {
			this.sebesseg = -1;
			throw new InvalidUnitException();
		}
	}

}
