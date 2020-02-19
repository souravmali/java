import java.util.Scanner;
import java.io.*;
import java.util.*;
class company1
{
	String cname;
	int sv,ns,total;
	public void getdata(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter a company	name");
	cname=s.next();
	System.out.println("enter a number of share");
	ns=s.nextInt();
	System.out.println("enter a share value");
	sv=s.nextInt();
    }
    public  void cal()
     {
     	total=ns*sv;
     }

     public void disp()
     {
     	System.out.printf("companyname=",cname);
     	System.out.printf("number of share=%d",+ns);
     	System.out.printf("price of share=%d",+sv);
     	System.out.printf("total=%d",+total);
     }
};
class company
{
	public static void main(String arg[])
	{
		company1 c=new company1();
		int i;
		for(i=0;i<3;i++)
		{
		c.getdata();
		c.cal();
		c.disp();
	}
	}
}