import java.util.Scanner;
import java.io.*;
import java.util.*;

class fibo
{
	public static void main(String arg[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		int a=0,b=1,c;
		System.out.println("enter a range");
		n=s.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}
}