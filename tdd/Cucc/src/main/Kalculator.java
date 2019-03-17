package main;

public class Kalculator {

	//gulyas_g
	//sajnos tov�bbra sem �rtem, hogy szimpl�n x, y-bol hogy van meg egy "relativ pozicio", de az�rt sz�molok valamit :D
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

}
