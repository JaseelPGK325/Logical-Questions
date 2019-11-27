package preps;
import java.util.*;
public class Frequencyofalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("enter string");
String a=s.nextLine();
int n=a.length();
System.out.println("Type which alphabet frequency you want to check in given string");
char b=s.next().charAt(0);
int count =0;
for(int i=0;i<n;i++) {
	if(a.charAt(i)==b) {
		count++;
	}
	}
System.out.println("The frequency of '"+b+"' in given String is "+count);

	}

}
