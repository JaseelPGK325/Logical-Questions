package preps;
import java.util.*;
public class arclength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter radius in cm");
float r=sc.nextFloat();
System.out.println("enter angle in degrees");
double a=sc.nextDouble();
double arc=(2*3.14*r)*(a/360);
System.out.println("arclength = "+arc+" cm");

	}

}
