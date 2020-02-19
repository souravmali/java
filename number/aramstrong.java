import java.util.Scanner;
import java.io.*;
import java.util.*;

class aramstrong
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,temp,sum=0,rev;
		System.out.println("enter a number");
		n=s.nextInt();
		temp=n;
		while(n>=1)
			{
				rev=n%10;
				n=n/10;
				sum=sum+rev*rev*rev;
			}
			if(temp==sum)
			{
				System.out.println("number is aramstrong");
			}
			else
			{
			System.out.println("number is not aramstrong");	
			}
	}
}