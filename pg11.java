package khatri;

import java.util.Scanner;

public class pg11 {
/**
* @param args
*/
		
		static int d[]=new int[20];
		static int s[]=new int[20];
		static int i,j,n,v,min;
		static int w[][]=new int[50][50];
		public static int findmin()
		{
			//int min;
			for(i=1;i<=n;i++)
			{
				if(s[i]==0)
				{
					min=i;
					break;
				}
			}
			for(i=1;i<=n;i++)
			{
				if(d[i]<d[min]&&s[i]==0)
				{
					min=i;
				}
			}
			return min;
		}
		
		
		public void dijk(int v,int w[][],int s[],int d[],int n)
		{
			int i,w1,u,k,j;
			int p[]=new int[20];
			for(i=1;i<=n;i++)
			{
				s[i]=0;
				d[i]=999;
				p[i]=0;
			}
			d[v]=0;
			for(k=1;k<=n;k++)
			{
				u=findmin();
				s[u]=1;
				for(w1=1;w1<=n;w1++)
				{
					if(w[u][w1]!=999&&s[i]==0)
					{
						if(d[w1]>d[u]+w[u][w1])
						{
							d[w1]=d[u]+w[u][w1];
							p[w1]=u;
						}
					}
				}
						
			}
			System.out.println("Shorthest path costs ");
			for(i=1;i<=n;i++)
			{
				if(d[i]==999)
				{
					System.out.println("Sorry no path from source "+v+" to "+i+"vertex");
				}
				else
					System.out.println("Path cost from source "+v+ " to "+i+" vertex is "+d[i]);
			}
			System.out.println("Shortest group of paths are : ");
			for(i=1;i<=n;i++)
			{
				if(i!=v&&d[i]!=999)
				{
					System.out.print(i);
					j=p[i];
					while(p[j]!=0)
					{
						System.out.println("<---"+j+" ");
						j=p[j];
					}
					System.out.println("<---"+v+"\n");
				}
			}
		}
		public static void main(String[] args)
		{
			pg11 d1=new pg11();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter number of vertices : ");
			n=in.nextInt();
			System.out.println("Enter weight matrix : ");
			for(i=1;i<=n;i++)
				for(j=1;j<=n;j++)
					w[i][j]=in.nextInt();
			System.out.println("Enter the source vertex : ");
			v=in.nextInt();
			d1.dijk(v, w, s, d, n);
		}
		
}