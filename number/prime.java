import java.util.Scanner;
import java.io.*;

class prime
{
	 public static void main(String[] args) {
	int n,temp=0,i;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	n=s.nextInt();
	for(i=2;i<=n-1;i++)
	{
	if(n%i==0)
	{
	 temp=temp+1;
	}
	}
	if(temp>0)
	{
	System.out.println("number is not prime");	
	}
	else
	{
	System.out.println("number is prime");
	}
}
}