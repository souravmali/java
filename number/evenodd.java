import java.util.Scanner;
import java.io.*;

class evenodd
{
	 public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	n=s.nextInt();
	if(n%2==0)
	{
	System.out.println("number is even");
	}
	else
	{
	System.out.println("number is odd");
	}
}
}