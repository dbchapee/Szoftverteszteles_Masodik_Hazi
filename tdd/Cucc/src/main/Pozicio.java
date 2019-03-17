package main;

public class Pozicio {
	//ahol x ???
	private int x;
	//ahol y ???
	private int y;
	//elveileg ez az eltérés az y tengelytol fogkban megadva (ami 0-366 for)
	private int irany;
	
	

	public int getIrany() {
		return irany;
	}

	public void setIrany(int irany) {
		this.irany = irany;
	}

	public Pozicio(int x, int y, int irany) {
		super();
		this.x = x;
		this.y = y;
		this.irany = irany;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
