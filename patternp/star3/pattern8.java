//* 
// * 
//  *
//   *

class pattern8
{
public static void main(String arg[])
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
if(i>=2&&j<=i-1)
{
System.out.print(" ");
}
else
{
System.out.print("*");
}
}
System.out.println("");
}
}
}




