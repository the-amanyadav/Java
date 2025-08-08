class Rocket
{
	public static void main(String...ar)
	{
		int i,j,n,sp,x=1;
		System.out.println("Enter The Size ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n>1&&n%2!=0)
		{
			//System.out.println(n/2+1);
			for(i=0;i<=n/2;i++)
			{
				sp=n+n/2-i;
				for(j=0;j<sp;j++)
				{
					System.out.print(" ");
				}
				for(j=0;j<x;j++)
				{
					System.out.print("*");
				}
				x+=2;
				System.out.println();
			}
			for(i=0;i<n-2;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(" ");
				}
				System.out.print("@");
				for(j=0;j<n-2;j++)
				{
					System.out.print(" ");
				}
				System.out.print("@");
				System.out.println();
			}
			x=n;
			sp=n-2;
			for(i=0;i<n/2+1;i++)
			{
				for(j=0;j<i;j++)
				{
					System.out.print(" ");
				}
				for(j=0;j<x;j++)
				{
					System.out.print("*");
				}
				if(i==0)System.out.print("@");
				for(j=0;j<sp;j++)
				{
					System.out.print(" ");
				}
				if(i==0)System.out.print("@");
				for(j=0;j<x;j++)
				{
					System.out.print("*");
				}
				if(i==0)sp+=2;
				sp+=2;
				x-=2;
				System.out.println();
			}
		}
		else
		{
			System.out.print("Invalid Input");
		}
	}
}