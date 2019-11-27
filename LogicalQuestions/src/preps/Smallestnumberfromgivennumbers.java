package preps;
import java.util.*;
import java.util.Scanner;

public class Smallestnumberfromgivennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number of elements in array");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++) {
	a[i]=s.nextInt();
	
}
Arrays.sort(a);
System.out.println("Smallest number from the given numbers");
System.out.println(a[0]);
	}

}
