import java.util.Scanner;
import java.io.*;

public class number1
{
	public static void main(String arg[])
	{
	Scanner s=new Scanner(System.in);
	int result,a,b;
	System.out.println("enter a two number");
	a=s.nextInt();
	b=s.nextInt();
	int sum=add(a,b);
	System.out.println(sum);
	int diff=sub(a,b);
	System.out.println(diff);
	int prod=mul(a,b);
	System.out.println(prod);
	}

static int add(int x,int y)
{
	return x+y;
}
static int sub(int x,int y)
{
	return x-y;
}
static int mul(int x,int y)
{
	return x*y;
}
}