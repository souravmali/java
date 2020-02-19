import java.util.Scanner;
import java.io.*;
import java.util.*;

class spalidrom
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String name,temp;
		System.out.println("enter a string");
		name=s.next();
		temp=name;
		int len=name.length();
		String rev="";
		int i;
		for(i=len-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
			if(temp==rev)
		{
			System.out.println("string is palindrome");
		}

		else{
		System.out.println("string is not palindrome");
	}
}
}