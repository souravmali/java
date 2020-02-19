import java.util.Scanner;
import java.io.*;
class swap
{
	public static void main(String args[])
	{
		int a,b,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value of a");
		a=s.nextInt();

		System.out.println("enter a value of b");
		b=s.nextInt();

		temp=a;
		a=b;
		b=temp;

		System.out.printf("value of a=%d",+a);
		//System.out.println(a);
		System.out.printf("value of b=%d",+b);	
		//System.out.println(b);
	}
}

//a=a+b;
//b=a-b;
//a=a-b