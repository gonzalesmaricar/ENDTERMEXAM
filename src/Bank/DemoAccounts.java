package Bank;
import java.io.*;

import BankAccount.Checking;
import BankAccount.Savings;
public class DemoAccounts {
	public static void main(String args[])
	{
		/*Instantiating and displaying both Checking and Savings object */
		Checking ch = new Checking (12001);
		ch.setBal(10000.59);
		ch.getAccno();
		ch.getBal();
		
		Savings sav = new Savings (19261. 10.9F);
		sav.setBal(00500.72);
		sav.getAccno();
		sav.getBal();
	}

}
