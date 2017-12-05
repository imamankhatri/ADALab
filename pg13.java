package khatri;

import java.util.*;

public class pg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,u=0,min,sum;
		min=sum=0;
		int ne=1;int v=0;
		int c[][] = new int[10][10];
		int vi[]=new int[10];
		int s;
		System.out.println("Enter Number of edges : ");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println("Enter Adjacency Matrix : ");
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				c[i][j]=in.nextInt();
		for(i=1;i<=n;i++)
			vi[i]=0;
		
		System.out.println("Enter Source : ");
		s=in.nextInt();
		vi[s]=1;
		while(ne<n)
		{	
			min=999;
			for(i=1;i<=n;i++)
				if(vi[i]==1)
					for(j=1;j<=n;j++)
						if(vi[j]!=1)
						{
							if(c[i][j]<min)
							{
								min=c[i][j];
								u=i;
								v=j;								
							}
						}
			ne++;
			sum+=min;
			vi[v]=1;
			System.out.println("Edge "+ne+" from "+u+" to " +v+" is "+min);
			//c[u][v]=c[v][u]=999;
		}
		System.out.println("Weight : "+sum);
	}

}
