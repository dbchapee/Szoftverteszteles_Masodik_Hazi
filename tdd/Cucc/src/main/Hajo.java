package main;

public class Hajo {
	private Tomeg weight;
	private Sebesseg speed;
	private Hossz length;
	private Pozicio pozicio;
	private Double Ir�ny;
	
	
	
	public Pozicio getPozicio() {
		return pozicio;
	}

	public void setPozicio(Pozicio pozicio) {
		this.pozicio = pozicio;
	}

	public int getIrany() {
		return pozicio.getIrany();
	}
	
	public Tomeg getWeight() {
		return weight;
	}

	public void setWeight(Tomeg weight) {
		this.weight = weight;
	}

	public Sebesseg getSpeed() {
		return speed;
	}

	public void setSpeed(Sebesseg speed) {
		this.speed = speed;
	}

	public Hossz getLength() {
		return length;
	}

	public void setLength(Hossz length) {
		this.length = length;
	}


	
	public Hajo(Tomeg w, Hossz length, Sebesseg s, Pozicio p,Double irany) {
		this.weight = w;
		this.length = length;
		this.speed = s;
		this.pozicio = p;
		this.Ir�ny=irany;
	}

	public boolean gonnaCrashTo(Hajo otherShip, int irany, Pozicio pos) {
		return false;
	}

	public Double getIr�ny() {
		return Ir�ny;
	}

	public void setIr�ny(Double ir�ny) {
		Ir�ny = ir�ny;
	}
}
