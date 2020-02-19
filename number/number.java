import java.util.Scanner;
import java.io.*;

public class number
{
	public static void main(String arg[])
	{
	Scanner s=new Scanner(System.in);
	int result,a,b;
	int ch;
	System.out.println("enter a two number");
	a=s.nextInt();
	b=s.nextInt();
	System.out.println("1.addtition");
	System.out.println("2.sub");
	System.out.println("3.div");
	System.out.println("enter a choice");
	ch=s.nextInt();
	switch(ch)
	{
	case 1:
	result=add(a,b);
	System.out.print("addtion=");
	System.out.println(result);
	break;

		case 2:
	result=sub(a,b);
	System.out.print("sub=");
	System.out.println(result);
	break;

		case 3:
	result=mul(a,b);
	System.out.print("mul=");
	System.out.println(result);
	break;

	}
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