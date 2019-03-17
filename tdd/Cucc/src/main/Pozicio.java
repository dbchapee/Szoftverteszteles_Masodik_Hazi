package main;

public class Pozicio {
	//ahol x ???
	private int x;
	//ahol y ???
	private int y;
	//elveileg ez az eltérés az y tengelytol fogkban megadva (ami 0-360 fok)
	private int irany;
	
	

	public int getIrany() {
		return irany;
	}

	public void setIrany(int irany) {
		this.irany = irany;
	}

	public Pozicio(int x, int y, int irany) throws InvalidUnitException {
		super();
		this.x = x;
		this.y = y;
		if(irany > 360 || irany < 0) {
			this.irany = -1;
			throw new InvalidUnitException();
		}
		else{
			this.irany = irany;
		}
		
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
