import java.io.*;
import java.util.*;

class linear
{
	public static void main(String args[])
	{
		int a[]={3,8,5,6,2,8,1};
		int item=2;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("element on"+i+" position");
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("element are not found");
		}
	}
}
