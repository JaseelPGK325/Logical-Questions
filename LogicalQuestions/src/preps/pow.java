package preps;
import java.util.*;
public class pow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter the base value");
int base = sc.nextInt();
System.out.println("Enter the exponent value");
 int exponent = sc.nextInt();
int result=1;
for(int i=1;i<=exponent;i++) {
	result=result*base;
}
System.out.println("Resultant value is :" +result);

}

}
