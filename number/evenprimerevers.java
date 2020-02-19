import java.util.*;
import java.util.Scanner;
import java.io.*;

class evenprimerevers
{
	public static void main(String[] args) {
			evenprimerevers e=new evenprimerevers();
		int n,ch,result;
		int a=0,b=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		n=s.nextInt();
		System.out.println("0.exit");
		System.out.println("1.evenodd");
		System.out.println("2.prime");
		System.out.println("3.revers");
		System.out.println("4.palindrome");
		System.out.println("5.factorial");
		System.out.println("6.fiboseries");
		System.out.println("7.aramstrong");
		System.out.println("enter a choice");
		ch=s.nextInt();

		switch(ch)
		{
			case 1:
			evenodd(n);
			break;

			case 2:
			prime(n);
			break;

			case 3:
			//result=revers(n);
			result=e.revers(n);
			//System.out.printf("revers no is=%d",+result); 
			System.out.println(result);
			break;

			case 4:
			e.palindrome(n);
			break;

			case 5:
			result=e.factr(n);
			System.out.println(result);
			break;

			case 6:
			System.out.println(a);
			System.out.println(b);
			e.fibo(a,b,n);
			break;

			case 7:
			e.aram(n);
			break;
			
			
		}		
						
	}
	   static void evenodd(int x)
	{
		int i;
		if(x%2==0)
		{
			System.out.println("number is even");
			
		}
		else
		{
			System.out.println("nummber is odd");
			
		}
	}

		static void prime(int x)
	{
		int i,temp=0;
		for(i=2;i<=x-1;i++)
		{
			if(x%i==0)
			{
				temp=temp+1;
			}
		}

			if(temp>0)
			{
				System.out.println("nummber is not prime");
			}
		else
		{
			System.out.println("number is prime");
			
		}
	}

	  int revers(int x)
	{
		int rev=0,rem;
		while(x!=0)
		{
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		return rev;
	}


	   void palindrome(int x)
	{
		int rev=0,rem,temp=0;
		temp=x;
		while(x!=0)
		{
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		System.out.printf("revers number is=%d",+rev);
		if(rev==temp)
		{
			System.out.printf("is palindrome");
		}

		else
			{
			System.out.printf(" is not palindrome");
		}
	}

	int factr(int n)
	{
		int fact=1;
		if(n>=1)
		{
			fact=fact*n;
			factr(n-1);

		}
		return fact;
	}

	void fibo(int a,int b,int n)
	{
		int c;
		if(n>=1)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			fibo(a,b,n-1);
		}

	}

	void aram(int n)
	{
		int sum=0,temp,rev;
		temp=n;
		while(n>0)
		{
			rev=n%10;
			n=n/10;
			sum=sum+rev*rev*rev;
		}
		if(temp==sum)
		{
			System.out.println("number is aramstrong");
		}
		else
		{
			System.out.println("number is not aramstrong");
		}

	}
}
