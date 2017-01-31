package display;
import engine.*;

public class Console 
{
	public static void affiche_objet (£Objets o)
	{
		if (o instanceof Chien)
		{
			System.out.println("Position : " + o.get_X() +" " + o.get_y() + "\n Vie : " + o.get_vie()+"\n");
		}
	}
}
