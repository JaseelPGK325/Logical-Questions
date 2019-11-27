package preps;

import java.util.Scanner;

public class hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter base");
		float b=s.nextFloat();
		System.out.println("enter hight");
		float h=s.nextFloat();
		float hyp=(h*h)+(b*b);
		float hy=(float) Math.sqrt(hyp);
System.out.println("Hypotenuse of right-angled triangle "+hy);
	}

}
