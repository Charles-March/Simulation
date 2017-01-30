package display;
import engine.*;

public class Console 
{
	public void affiche_objet (£Objets o)
	{
		System.out.println("Position : " + o.x +" " + o.y + "\n Vie : " + o.vie + "\n Il a faim le toutout? " + o.faim);
	}
}
