package main;

public class Pozicio {
	//ahol x ???
	private int x;
	//ahol y ???
	private int y;
	//elveileg ez az elt�r�s az y tengelytol fogkban megadva (ami 0-360 fok)

	public int getIrany() {
	    int angle = (int) Math.toDegrees(Math.atan2(0 - y, 0 - x));
	    if(angle < 0){
	        angle += 360;
	    }
	    return angle;
	}

	public Pozicio(int x, int y, int irany) throws InvalidUnitException {
		super();
		this.x = x;
		this.y = y;
		if(getIrany() > 360 || getIrany() < 0) {
			throw new InvalidUnitException();
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
