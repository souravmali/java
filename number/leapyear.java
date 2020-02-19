import java.util.Scanner;
import java.io.*;
import java.util.*;


class leapyear
{
	 public static void main(String[] args) {
	 	int year;
	 	Scanner s=new Scanner(System.in);
	 		System.out.println("enter a year");
	 		year=s.nextInt();
	 		if(year%400==0||(year%4==0&&year%100!=0))
	 		{
	 			System.out.println("yera is leap ");
	 		}
	 		else
	 		{
	 		System.out.println("yera is not leap ");	
	 		}

		
	}
	
}
