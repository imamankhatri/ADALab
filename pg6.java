package khatri;

import java.util.*;

public class pg6 {
	
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		run1 r1 = new run1();
		Thread t1 = new Thread(r1);
		t1.start();
		t1.sleep(5000);
		run2 r2 = new run2();
		Thread t2 = new Thread(r2);
		t2.start();
		t2.sleep(5000);
		run3 r3 = new run3();
		Thread t3 = new Thread(r3);
		t3.start();
		//t3.sleep(5000);
		
	}

}
class run1 implements Runnable{
	public void run()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a");
		int a = in.nextInt();
		System.out.println("Square of a = "+(a*a));
	}
}
class run2 implements Runnable{
	public void run()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter b");
		int b = in.nextInt();
		System.out.println("Cube of b = "+(b*b*b));
	}
}

class run3 implements Runnable{
	public void run()
	{
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println();
		int i;
		System.out.println("5 Random elements");
		for(i=0;i<5;i++)
			System.out.println(+r.nextInt(50));
			
	}
}

