package display;
import engine.*;

public class Console 
{
	public static void affiche_objet (£Objets o)
	{
		System.out.println("Position : " + o.get_x() +" " + o.get_y() + "\n Vie : " + o.get_vie());
	}
}
