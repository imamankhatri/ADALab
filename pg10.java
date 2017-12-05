package khatri;

import java.util.*;

public class pg10 {
	public static void knap(int n, int item[],float weight[],float profit[],float capacity)
	{
		float tp=0,u;
		int i;
		float x[]=new float[20];
		u=capacity;
		for(i=0;i<n;i++)
			x[i]=(float)0.0;
		for(i=0;i<n;i++)
		{
			if(weight[i]>u)
				break;
			else
			{
				x[i]=(float)1.0;
				tp=tp+profit[i];
				u=(int)(u-weight[i]);
			}
		}
		if(i<n)
		{
			x[i]=u/weight[i];
		}
		tp+=(x[i]*profit[i]);
		System.out.println("The result vector is : ");
		for(i=0;i<n;i++)
		{
			System.out.println("Item "+item[i]+" : " + x[i]);
		}
		System.out.println("Max profit is : "+tp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float weight[]=new float[20];
			float profit[]=new float[20];
			float cap;
			float ratio[]=new float[20];
			int i,n,j;
			//float ratio[]=new float[20];
			float temp;
			int item[]=new int[20];
			System.out.println("Enter capacity : ");
			Scanner in = new Scanner(System.in);
			cap=in.nextFloat();
			System.out.println("Enter n : ");
			n=in.nextInt();
			System.out.println("Enter Items,Weights and Profits :");
			for(i=0;i<n;i++)
				{
				item[i]=in.nextInt();
				weight[i]=in.nextFloat();
				profit[i]=in.nextFloat();
				}
			for(i=0;i<n;i++)
				ratio[i]=profit[i]/weight[i];
			for(i=0;i<n;i++)
				for(j=i+1;j<n;j++)
				{
					if(ratio[i]<ratio[j])
					{
						temp=ratio[j];
						ratio[j]=ratio[i];
						ratio[i]=temp;
						
						temp=weight[j];
						weight[j]=weight[i];
						weight[i]=temp;
						
						temp=profit[j];
						profit[j]=profit[i];
						profit[i]=temp;
						
						temp=item[j];
						item[j]=item[i];
						item[i]=(int)temp;
					}
				}
			knap(n,item,weight,profit,cap);
	}

}
