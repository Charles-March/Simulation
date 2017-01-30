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
		setFaim(pfaim);
		handicape = phandicape;
	}

	public boolean isFaim() 
	{
		return faim;
	}

	public void setFaim(boolean faim) 
	{
		this.faim = faim;
	}
	
	public void faire_tour()
	{
		if (handicape && faim)
			vie = vie-2;
		else if (handicape || faim)
			vie --;	
	}



	
}
