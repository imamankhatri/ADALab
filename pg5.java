package khatri;

import java.util.*;

public class pg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a and b : ");
		a=in.nextInt();
		b=in.nextInt();
		try{
			d=a/b;
			System.out.println("The result of "+a+"/"+b+" is "+d);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception, DIVIDE BY ZERO ERROR");
		}
	}

}
