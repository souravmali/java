import java.util.*;
import java.util.Scanner;
import java.io.*;
class Fact
{
	public static void main(String args[])
	{
		int n,i,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		n=s.nextInt();
		for( i=1;i<=n;i++)
		{	
			fact=fact*i;
		}
		System.out.printf("factorial =%d",fact);
	}
}