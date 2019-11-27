package preps;
import java.util.*;
public class dectooct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter decimal number");
int dec=s.nextInt();
int temp=dec;
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
System.out.println(temp+" in octal is "+oct);

	}

}
