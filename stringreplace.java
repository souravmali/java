import java.io.*;
import java.util.*;
import java.util.Scanner;

class stringreplace
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char a;
		String b;
		String c="";
		System.out.println("enter a replace char");
		a=s.next.charAt(0);
		s.nextLine();
		System.out.println("enter a  string to replace");
		b=s.nextLine();
		for(int i=0;i<b.length();i++)
		{
			if(b.charAt(i)==a)
			{
				c=c+"*";
			}
			else
			{
				c=c+b.charAt(i);
			}

		}
		System.out.println("relace string ="+c);


	}
}