package Play;
import display.*;
import engine.*;

public class main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Chien[] T = new Chien[5];
		
		for(int i = 0; i<= 5; i++)
		{
			T[i] = new Chien(i+2,i+5,i,i%2==0,i%3==1);
			T[i].faire_tour();
			T[i].faire_tour();
			Console.affiche_objet(T[i]);
		}
		
		
		
	}

}
