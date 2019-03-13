package main;

public class Tomeg implements Comparable<Tomeg>{
	
	private double tomeg;
	
	public Tomeg(double tomeg, String mertekEgyseg) throws InvalidUnitException {
		if (mertekEgyseg.equals("kg")) this.tomeg = tomeg*1000;
		else if (mertekEgyseg.equals("t")) this.tomeg = tomeg*1000000;
		else if (mertekEgyseg.equals("oz")) this.tomeg = tomeg*28.34952;
		else if (mertekEgyseg.equals("lb")) this.tomeg = tomeg*28.34952*16;
		else if (mertekEgyseg.equals("g")) this.tomeg = tomeg;
		else {
			this.tomeg = -1;
			throw new InvalidUnitException();
		}
	}
	
	public double getTomeg() {
		return this.tomeg;
	}
	
	public int compareTo(Tomeg o) {
		if (this.getTomeg() < o.getTomeg()) return -1;
		else if (this.getTomeg() > o.getTomeg()) return 1;
		else return 0;
	}
	
}
