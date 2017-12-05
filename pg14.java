package khatri;



import java.util.Scanner;

public class pg14 {
	
	public static void floyd(int a[][],int n)
	{
		int d[][]=new int[10][10];
		int i,j,k;
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				d[i][j]=a[i][j];
		for (k=1;k<=n;k++)
			for(i=1;i<=n;i++)
				for(j=1;j<=n;j++)
					d[i][j]=min(d[i][j],d[i][k]+d[k][j]);
		System.out.println("The distance Matrix : \n");
		for(i=1;i<=n;i++)
			{for(j=1;j<=n;j++)
				System.out.print(d[i][j]+"\t");
			System.out.println();
			}
		
	}
	
	public static int min(int a,int b)
	{
		if(a<b)
			return a;
		else return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[10][10];
		int n;int i,j;
		System.out.println("Enter value of n : ");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println("Enter distance Matrix : ");
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				a[i][j]=in.nextInt();
		floyd(a,n);
						
		
		
		
	}

}
