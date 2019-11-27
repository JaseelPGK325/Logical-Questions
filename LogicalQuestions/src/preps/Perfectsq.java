package preps;
import java.util.*;
public class Perfectsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
float m=(float) Math.sqrt(n);
int k= (int) m;
	if(k==m) {
		System.out.println("perfect square");
	}else {
		System.out.println("not perfect square");
	}
}
	

	
}