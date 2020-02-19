import java.util.Scanner;
import java.io.*;
import java.util.*;

class FactRecurtion
{
	public static void main(String arg[])
	{
		FactRecurtion f=new FactRecurtion();
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enetr a number");
		n=s.nextInt();
		
		int result =f.factr(n);
		System.out.println(result);
	}

int factr(int n)
{	
	//int fact=1;
	if(n>=1)
	{
			//fact=fact*n;
			//factr(n-1);
		 return factr(n-1)*n;
			//return fact;
	}
	return 1;
}
}