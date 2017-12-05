package khatri;

import java.util.Scanner;

public class pg9 {
	
	private static int w[]=new int [10];
	private static int b[]=new int [10];
	private static int v[][]=new int [10][10];
	private static int val[]=new int[10];
	
	static int max(int a,int b)
	{
		if (a>b)
			return a;
		else
			return b;
	}
	static int knap(int i,int j)
	{
		if(i==0||j==0)
			v[i][j]=0;
		else if (j<w[i])
			v[i][j]=knap(i-1,j);
		else
			v[i][j]=max(knap(i-1,j),val[i]+knap(i-1,j-w[i]));
		return v[i][j];	
	}
	static void optimal(int i,int j)
	{
		if(i>=1||j>=1)
			if(v[i][j]!=v[i-1][j])
			{
				System.out.println("Item " +i);
				b[i]=1;
				j=j-w[i];
				optimal(i-1,j);
			}
			else
				optimal(i-1,j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,w1;
		System.out.println("Enter the number of items : ");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println("Enter capacity : ");
		w1 = in.nextInt();
		System.out.println("Enter item values : ");
		for(i=1;i<=n;i++)
			val[i]=in.nextInt();
		System.out.println("Enter item weights : ");
		for(i=1;i<=n;i++)
			w[i]=in.nextInt();
		int profit = knap(n,w1);
		System.out.println("Matrix : ");
		//int j=0;
		/*for(i=0;i<n;i++)
			{for(j=0;j<n;j++)
				System.out.print(v[i][j]+"\t");
			System.out.println();
			}*/
		System.out.println("Profit : "+profit);
		optimal(n,w1);
		System.out.println("Solution vector is : \n");
		for(i=1;i<=n;i++)
			System.out.println(b[i]);
		
	}

}
