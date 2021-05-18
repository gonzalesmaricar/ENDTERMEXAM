package Bank;

import java.io.*;
public class Savings {
	float interest;
	Savings(int no, float i)
	{
		super();
		interest = i;
	}
	public Savings(double d) {
		// TODO Auto-generated constructor stub
	}
	public void getAccno()
	{
		System.out.println("\n\nSaving Account Information");
		System.out.println("\nAccount number is:" +accno);
	}
	public void getBal()
	{
		System.out.println("\nThe balance is :" + accbal);
		System.out.println("nThe rate of interest is :" + interest+"%");
	}

}