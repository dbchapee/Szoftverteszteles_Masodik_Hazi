package main;

public class Kalculator {

	//return 1: nem kell csinalni semmit
	//return 2: lassitani kell
	//return 3: elsobbsegunk van
	public int are_we_gonnaCrashTo(Hajo ourship, Hajo theirship) {		
		if (theirship.getPozicio().getIrany() == 0)	{
			return 1;
			}
		return 0;
	}

	public boolean keresztezikEgymast(Hajo hajo1, Hajo hajo2) {
		if (((hajo2.getPozicio().getX() > 0 && hajo2.getIrany() <= 180) &&
			(hajo1.getPozicio().getX() > 0 && hajo1.getIrany() <= 180))
			|| 
			((hajo2.getPozicio().getX() < 0 && hajo2.getIrany() > 180) &&
			(hajo1.getPozicio().getX() < 0 && hajo1.getIrany() > 180))
			) {
			return false;
		}
		else return true;
	}
	
	public Pozicio getMetszesPont(Hajo hajo1, Hajo hajo2) throws Exception {
		double vx = hajo2.getSpeed().getSebesseg() * Math.cos((double) 90 - hajo1.getIrany());
		double vy = hajo2.getSpeed().getSebesseg() * Math.sin((double) 90 - hajo1.getIrany());
		double dx = hajo1.getPozicio().getX();
		double dy = hajo1.getPozicio().getY();
		double mikorKeresztezi = -(dx / vx);
		int holKereszteziY = (int) (dy + vy * mikorKeresztezi);
		return new Pozicio(0, holKereszteziY);
	}

}
