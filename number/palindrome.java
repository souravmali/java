import java.util.Scanner;
import java.io.*;
import java.util.*;


class palindrome
{
	 public static void main(String[] args) {
	int n,rev=0,rem,temp=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	n=s.nextInt();
	temp=n;
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(rev);

	if(rev==temp)
	{
		System.out.println("number is palindrome");
	}
	else
	{
	System.out.println("number is not palindrome");	
	}

}
}