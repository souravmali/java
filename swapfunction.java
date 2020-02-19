import java.io.*;
import java.util.*;
import java.util.Scanner;

class swapfunction
{
	public static void main(String arg[])
	{
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter value of a");
	a=s.nextInt();
	System.out.println("enter value of b");
	b=s.nextInt();
	swapfunction f=new swapfunction(a);
	swapfunction f1=new swapfunction(b);
	swapf(f,f1);
	}
	static void swapf(swapfunction f,swapfunction f1 )
	{
		int t;
		t=f.a;
		f.a=f1.b;
		f1.b=t;
		System.out.println("value of a=",f.a);
		System.out.println("value of b=",f1.b);
	}
}

