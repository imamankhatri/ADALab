package khatri;

import java.util.*;

public class pg4 {
	public String read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name and DOB in <NAME,DD/MM/YY> format : \n");
		String s=sc.nextLine();
		if(!s.startsWith("<")||!s.endsWith(">"))
		{
			System.out.println("Invalid FORMAT");
			System.exit(0);
		}
		return s;
	}

	public void disp(String str)
	{
		Scanner sc = new Scanner(System.in);
		StringTokenizer token = new StringTokenizer(str,"<,/>");
		String fs = null;
		while(token.hasMoreTokens())
		{
			if(fs==null)
				fs=token.nextToken();
			else
				fs=fs+","+token.nextToken();
		}
		System.out.println("Resultant = <"+fs+">");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pg4 c = new pg4();
		String data = c.read();
		c.disp(data);
	}

}
