package preps;

import java.util.Scanner;

public class facto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int n=s.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial of "+n+" is "+fact);
	}

}
