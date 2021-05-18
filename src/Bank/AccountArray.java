package Bank;
import java.io.*;
public class AccountArray{

	public static void Main(String args[]) 
	{
		/* A mix of 5 Checking and Savings accounts which are initialised and values are printed*/
		Checking ch[]=new Checking[5];
		for (int i=0; i<5;i++)
		{
		ch[i] = new Checking(12001+10*i);
		ch[i].setBal(10000.59+8*i);
		ch[i].getAccno();
		ch[i].getBal();
		}
		Savings sav[] = new Savings[5];
		for (int i=0; i<5;i++)
		{
			double= 10+102*i;
			float f = (float) d;
			sav[i]= new Savings (19261+3*i,f);
			sav[i].setBal(100500.72+7*i);
			sav[i].getAccnp();
			sav[i].getBal();
		}
	}
}
		
	
	

}
