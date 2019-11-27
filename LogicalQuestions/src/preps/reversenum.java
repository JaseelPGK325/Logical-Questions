package preps;

import java.util.Scanner;
import java.util.*;
public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int r=0;
		while(n!=0){
			int n1=n%10;
			 r=(r*10)+n1;
			n=n/10;
		}
		System.out.println(r);
	}

}
