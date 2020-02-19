import java.util.Scanner;
import java.io.*;
import java.util.*;

class stringrevers
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String name;
		System.out.println("enter a string");
		name=s.next();
		int len=name.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
}