package khatri;

import java.util.*;

public class pg8 {
	
	static int max=5000;
	public static void ms(int a[],int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid=(low+high)/2;
			ms(a,low,mid);
			ms(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	
	public static void merge(int a[],int low,int mid,int high)
	{
		int k=low,i=low,j=mid+1;
		int c[]=new int[100];
		while(i<=mid&&j<=high)
		{
			if(a[i]<a[j])
				c[k++]=a[i++];
			else c[k++]=a[j++];
		}
		while (i<=mid)
			c[k++]=a[i++];
		while (j<=high)
			c[k++]=a[j++];
		for(i=low;i<=high;i++)
			a[i]=c[i];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter n : ");
		n=in.nextInt();
		Random r = new Random();
		int a[]= new int[n];
		try{
			for(i=0;i<n;i++)
				a[i]=r.nextInt(500);
			System.out.println("The random elements are : ");
			for(i=0;i<n;i++)
				System.out.println(a[i]);
			ms(a,0,n-1);
			System.out.println("The sorted elements are : ");
			for(i=0;i<n;i++)
				System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}

}
