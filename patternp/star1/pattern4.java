

//****
// ***
//  **
//   *		
class pattern4
{
	public static void main(String arg[])
	{
		int i,j,k;
			for(i=1;i<=4;i++)
			{
				for(j=2	;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(k=4;k>=i;k--)
				{
					System.out.print("*");
				}

			System.out.println("");
			}
	}
}