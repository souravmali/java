import java.util.Scanner;
import java.io.*;
import java.util.*;

class fibor
{	
	//static int a=0,b=1,c;
	public static void main(String arg[])
	{
		fibor f=new fibor();
		int n;
		Scanner s=new Scanner(System.in);
		int a=0,b=1,c;
		System.out.println("enter a range");
		n=s.nextInt();
		System.out.println(a);
		System.out.println(b);
		f.fibore(a,b,n);

	}

		void fibore(int a,int b,int n)
		{   
			int c;	
			if(n>=1){
				
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			fibore(a,b,n-1);
		}
		}

	}