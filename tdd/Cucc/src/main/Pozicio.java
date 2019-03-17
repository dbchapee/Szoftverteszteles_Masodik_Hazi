package main;

public class Pozicio {
	
	private int x;
	private int y;
	

	public Pozicio(Hossz x, Hossz y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Hossz getX() {
		return x;
	}

	public void setX(Hossz x) {
		this.x = x;
	}

	public Hossz getY() {
		return y;
	}

	public void setY(Hossz y) {
		this.y = y;
	}
}
