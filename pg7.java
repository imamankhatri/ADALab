package khatri;

import java.util.Random;
import java.util.Scanner;

public class pg7 {
	static int max=5000;
	public static int partition(int a[],int low,int high)
	{
		int i,j,temp,key;
		key=a[low];
		i=low;j=high+1;
		while(i<=j)
		{
			do i++;
			while(key>=a[i]&&i<=high);
			do j--;
			while(key<a[j]);
			if(i<j)
			{
				temp = a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
			temp=a[low];
			a[low]=a[j];
			a[j]=temp;
			return j;
	}
	
	public static void qs(int a[],int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid = partition(a,low,high);
			qs(a,low,mid-1);
			qs(a,mid+1,high);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array :");
		n=in.nextInt();
		int a[]= new int[n];
		try
		{for (i=0;i<n;i++)
			a[i]=r.nextInt(500);
		System.out.println("Random Elements : ");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
		qs(a,0,n-1);
		System.out.println("Sorted Elements : ");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			String st = e.getMessage();
			System.out.println("ERROR : "+st);
		}
	}
}
