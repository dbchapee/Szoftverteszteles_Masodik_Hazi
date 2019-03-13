package main;

public class Hossz {
	
	private double hossz;
	final private double ZERO = 0.0;
	
	public Hossz(double hossz, String mertekEgyseg) throws InvalidUnitException {
		if (mertekEgyseg.equals("cm")) this.hossz = hossz;
		else if (mertekEgyseg.equals("m")) this.hossz = hossz*100;
		else if (mertekEgyseg.equals("km")) this.hossz = hossz*100000;
		else if (mertekEgyseg.equals("in")) this.hossz = hossz*2.54;
		else if (mertekEgyseg.equals("ft")) this.hossz = hossz*2.54*12;
		else if (mertekEgyseg.equals("yd")) this.hossz = hossz*2.54*12*3;
		else if (mertekEgyseg.equals("mile")) this.hossz = hossz*2.54*12*3*1760;
		else if (mertekEgyseg.equals("nm")) this.hossz = hossz*1852*100;
		else {
			this.hossz = -1;
			throw new InvalidUnitException();
		}
	}
	
	public double getHossz() {
		return this.hossz;
	}
	
	public int compareTo(Hossz h) {
		if (this.getHossz() < h.getHossz()) return -1;
		else if (this.getHossz() > h.getHossz()) return 1;
		else return 0;
	}
}
