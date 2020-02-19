import java.util.Scanner;
import java.io.*;
import java.util.*;

class stringrevers
{
	public sattic void main(String args[])
	{
		Scanner s=new Scanner(System.in)
		String name[10];
		System.out.println("enter a string");
		name=s.next();
		int len=name.length()
		String rev=
		for(i=len-1;i>=0;i++)
		{
			rev=rev+charAt(i);
		}
		System.out.println(rev);
	}
}