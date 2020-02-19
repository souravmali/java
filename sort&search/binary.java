import java.io.*;
import java.util.*;

class binary
{
	public static void main(String args[])
	{
		int a[]={2,6,8,10,15,16,18};
		int item=15;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi)
		{
			if(a[mi]==item)
				{
					System.out.println("element is on"+mi+" position");
					break;
				}

				else if(a[mi]<item)
				{
					li=mi+1;
				}
				else 
				{
					hi=mi-1;
				}
				mi=(li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("item are not found");
		}
	}
}