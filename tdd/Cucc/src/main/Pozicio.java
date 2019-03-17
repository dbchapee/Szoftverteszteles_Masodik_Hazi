package main;

public class Pozicio {
	private int x;
	private int y;
	
	public Pozicio(int x, int y) throws InvalidUnitException {
		super();
		this.x = x;
		this.y = y;
		if(getIrany() > 360 || getIrany() < 0) {
			throw new InvalidUnitException();
		}
	}

	public int getIrany() {
	    int angle = (int) Math.toDegrees(Math.atan2(0 - y, 0 - x));
	    if(angle < 0){
	        angle += 360;
	    }
	    return angle;
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
