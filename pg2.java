package khatri;

import java.util.*;

public class pg2 {
	int top,size;
	int stack[];
	
	public pg2(int asize)
	{
		size=asize;
		top=-1;
		stack=new int[size];
	}
	
	public void push(int x)
	{
		if(top==size-1)
			System.out.println("OVERFLOW");
		else 
		stack[++top]=x;
	}
	
	public int pop()
	{
		if(top==-1)
			return -1;
		else return stack[top--];
	}
	public void display()
	{	int i;
		if(top==-1)
			System.out.print("No Elements");
		else
			for(i=top;i>=0;i--)
				System.out.println(stack[i]+"\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s,i;
		int ch,c=1;
		System.out.println("Enter Size of Stack");
		s=in.nextInt();
		pg2 a=new pg2(s);
		do{
			System.out.println("1.Push\n2.Pop\n3.Display\n0.Exit\nEnter Choice : ");
			ch=in.nextInt();
			switch(ch)
			{
			case 1 : System.out.println("Enter element to push : ");
					a.push(in.nextInt());break;
			case 2 : if(a.pop()==-1) System.out.println("UNDERFLOW");
				else System.out.println("Element popped : "+a.pop());break;
			case 3 : a.display();break;
			default : System.exit(0);
			}
			System.out.println("Do you want to continue? Press 1 to continue...");
			c=in.nextInt();
		}while(c==1);
		
	}

}
