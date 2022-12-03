package khatri;
import java.util.Scanner;

public class pg1 {
	String usn;
	String name;
	long phone;
	void details()
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter USN, Name, Phone ");
		usn=in.nextLine();
		name=in.nextLine();
		phone=in.nextLong();
	}
	
	void put()
	{
		System.out.println("Details are :");
		System.out.println("USN :"+usn);
		System.out.println("Name :"+name);
		System.out.println("Phone :"+phone);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test commit
		int i,n;
		System.out.println("Enter n");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		pg1 a[] = new pg1[n];
		for(i=0;i<n;i++)
			a[i]=new pg1();
		for(i=0;i<n;i++)
			{
			System.out.println("Enter deatils of student"+(i+1));
			a[i].details();
			}
		for(i=0;i<n;i++)
		{
		System.out.println("Deatils of student"+(i+1));
		a[i].put();
		}
	}

}
