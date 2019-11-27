package preps;
import java.util.*;
public class bintooct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter binary number");
	String bin=s.next();
	int dec=Integer.parseInt(bin,2);
	String oct="";
	if(dec==0)
	{
		System.out.println("0");
	}
	while(dec!=0) {
		int a=dec%8;
		oct=a+oct;
		dec=dec/8;
	}
	System.out.println(bin+" in octal is "+oct);
	}

}
