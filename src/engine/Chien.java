package engine;

public class Chien extends £Vivant
{
	boolean handicape;
	private boolean faim;
	
	public Chien(int px,int py, int pv)
	{
		x = px;
		y =py;
		vie = pv;
	}
	
	public Chien(int px, int py, int pv, boolean pfaim, boolean phandicape )
	{
		x = px;
		y = py;
		faim = pfaim;
		handicape = phandicape;
	}
	
	public boolean envoie_faim()
	{
		return faim;
	}
	
}
