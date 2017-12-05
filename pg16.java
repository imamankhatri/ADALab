package khatri;

import java.util.*;


public class pg16 {
	static int count=0;
	private static int x[]=new int[10];
	private static int w[]=new int[10];
	private static int d;
	static void subset(int cs,int k,int r)
	{
		int i;
		x[k]=1;
		if(cs+w[k]==d)
		{
			System.out.println("Susbset "+(++count));
			for(i=0;i<=k;i++)
			{
				if(x[i]==1)
					System.out.println(w[i]);
			}
		}
		else if(cs+w[k]+w[k+1]<=d)
			subset(cs+w[k],k+1,r-w[k]);
		if(cs+r-w[k]>=d&&cs+w[k]<=d)
		{
			x[k]=0;
			subset(cs,k+1,r-w[k]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		int n=in.nextInt();
		int sum=0;int i;
		System.out.println("Enter Elements \n");
		for(i=0;i<n;i++)
		{
			w[i]=in.nextInt();
			sum+=w[i];
		}
		System.out.println("Enter required sum : ");
		d=in.nextInt();
		if(sum<d)
		{
			System.out.println("Error ");
		}
		subset(0,0,sum);
		if(count==0)
		{
			System.out.println("Error");
		}
	}

}
