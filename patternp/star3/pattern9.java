//    * 
//   *  
//  *
// *  
class pattern9
{
public static void main(String arg[])
{
int i,j,k;
for(i=1;i<=4;i++)
{
for(j=3;j>=i;j--)
{
System.out.print(" ");
} 
for(k=1;k<=i;k++)
{
if(i>=2&&k>1)
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