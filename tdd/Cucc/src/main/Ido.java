package main;

public class Ido {
	
	private double ido;
	
	public Ido(double ido, String mertekEgyseg) throws InvalidUnitException {
		if (mertekEgyseg.equals("s")) this.ido = ido;
		else if (mertekEgyseg.equals("m")) this.ido = ido*60;
		else if (mertekEgyseg.equals("h")) this.ido = ido*60*60;
		else {
			this.ido = -1;
			throw new InvalidUnitException();
		}
	}
}
