package main;

public class Kalculator {

	//gulyas_g
	//sajnos továbbra sem értem, hogy szimplán x, y-bol hogy van meg egy "relativ pozicio", de azért számolok valamit :D
	//return 1: nem kell csinalni semmit
	//return 2: lassitani kell
	//return 3: elsobbsegunk van
	public int are_we_gonnaCrashTo(Hajo ourship, Hajo theirship) {		
		if (theirship.getPozicio().getIrany() == 0)	{
			return 1;
			}
		return 0;
	}
	

}
