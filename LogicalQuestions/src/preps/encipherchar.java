package preps;

import java.util.Scanner;

public class encipherchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter plain character");
		char a=s.next().charAt(0);
		System.out.println("enter shift");
		int b=s.nextInt();
		int c=(int)a;
		int d=c+b;
		System.out.println("cipher character ");
		System.out.println((char)d);}

}
