package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Kalculator {

	//gulyas_g
	//sajnos tovï¿½bbra sem ï¿½rtem, hogy szimplï¿½n x, y-bol hogy van meg egy "relativ pozicio", de azï¿½rt szï¿½molok valamit :D
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

	

	//Ferenczi Kristóf /ELNXML
	public static boolean Crashing(Hajo ourship, Hajo othership)
	{
		
		double vx = othership.getSpeed().getSebesseg() * Math.cos((double) 90 - ourship.getIrany());
		double vy = othership.getSpeed().getSebesseg() * Math.sin((double) 90 - ourship.getIrany());
		double dx = ourship.getPozicio().getX();
		double dy = ourship.getPozicio().getY();
		double t = -(dx / vx);
		int holKereszteziY = (int) (dy + vy * t);
		
		double T = holKereszteziY / ourship.getSpeed().getSebesseg();
		
		
		Hossz ourhossz = ourship.getLength();
		Hossz otherhossz = othership.getLength();
		Double ourdt = (3.5 * ourhossz.getHossz())/ ourship.getSpeed().getSebesseg();
		Double otherdt = (3.5 * otherhossz.getHossz())/ othership.getSpeed().getSebesseg();
		
		HashMap<String,Double> ourzone = new HashMap<String, Double> ();
		ourzone.put("start",t- ourdt);
		ourzone.put("end",t + ourdt);
		
		
		HashMap<String,Double> otherzone = new HashMap<String, Double> ();
		otherzone.put("start",T- otherdt);
		otherzone.put("end",T + otherdt);
		
		if (ourzone.get("start")<otherzone.get("start") && otherzone.get("start")< ourzone.get("end"))
		{
			return true;
			
		}else if (ourzone.get("start")<otherzone.get("end") && otherzone.get("end")< ourzone.get("end") )
		{return true;}
		
		else
		return false;
	}
	
	
	
	
	/*
	 * - Ha a másik hajó iránya 270-360° vagy 0-90° között van, akkor
	 * 		1
    		- Ha jobbra van tõlünk (dx > 0), õ mehet, mi lassítunk
    		2
    		- Ha balra van tõlünk (dx < 0), mi mehetünk, de figyeljünk rá
  		- Ha 90-270° az iránya, akkor
  			3
    		- Ha õ a nehezebb, akkor mi mehetünk, de figyeljünk
    		4
    		- Ha mi vagyunk nehezebbek, õ mehet, mi lassítunk
	 * */
	
	public int ki_kell_e_terni (Hajo ourship, Hajo theirship) {
		boolean result = Crashing(ourship, theirship);
		if ( result == true ) {
			if((theirship.getPozicio().getIrany() > 270 && theirship.getPozicio().getIrany()<360)	||
				(theirship.getPozicio().getIrany() > 0 && theirship.getPozicio().getIrany()<90))
					return 1;
			if(theirship.getPozicio().getIrany() > 90 && theirship.getPozicio().getIrany()<270) {
				return 3;
			}
			

		}
		return 0;
		
		
	}
	
}
