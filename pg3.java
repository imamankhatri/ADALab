package khatri;

import java.util.*;

class staff{
	int sid;
	String sname;
	long ph;
	void getSD()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Staff ID, Name, Phone :");
		sid=in.nextInt();
		sname=in.next();
		ph=in.nextLong();
	}
	void putSD()
	{
		System.out.println("Details : ");
		System.out.println("Staff ID : "+sid);
		System.out.println("Name : "+sname);
		System.out.println("Phone : "+ph);
	}
};

class teaching extends staff{
	String domain;
	String pub;
	void getTD()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter domain and publication : ");
		domain=in.nextLine();
		pub=in.nextLine();
	}
	void putTD()
	{
		System.out.println("Domain : "+domain);
		System.out.println("Publication : "+pub);
	}
};

class technical extends staff{
	String skills;
	float sal;
	void getTeD()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Skills and salary :");
		skills=in.nextLine();
		sal=in.nextFloat();
	}
	void putTeD()
	{
		System.out.println("Skills : "+skills);
		System.out.println("Salary : "+sal);
	}
}



public class pg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of items : ");
		n=in.nextInt();
		staff st[]= new staff[n];
		teaching te[]=new teaching[n];
		technical t[]=new technical[n];
		for(i=0;i<n;i++)
		{
			st[i]=new staff();
			te[i]=new teaching();
			t[i]=new technical();
		}
		System.out.println("Enter the details : ");
		for(i=0;i<n;i++)
		{	
			System.out.println("Staff "+(i+1));
			st[i].getSD();
			te[i].getTD();	
			t[i].getTeD();
		}
		System.out.println("Details : ");
		for(i=0;i<n;i++)
		{
			System.out.println("Staff "+(i+1));
			st[i].putSD();
			te[i].putTD();
			t[i].putTeD();
		}
	}

}
