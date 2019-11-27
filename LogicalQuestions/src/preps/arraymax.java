package preps;
import java.util.*;
public class arraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter size of array");
int size=s.nextInt();
int a[]=new int[size];
int max=a[0];

System.out.println("enter elements of array");
for(int i=0;i<size;i++) {
	a[i]=s.nextInt();
	 if (a[i] > max) 
         max = a[i];
  
}
System.out.println("Largest in given array is "+max);
	}

}
