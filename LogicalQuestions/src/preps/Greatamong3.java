package preps;
import java.util.*;
public class Greatamong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter 3 numbers");
int n1=s.nextInt();
int n2=s.nextInt();
int n3=s.nextInt();
int l=0;
if(n1<n2) {
	l=n2;
}else{
	l=n1;
	
}
if(n3>l) {
	System.out.println("largest number among three is "+n3);
}
else {
	System.out.println("largest number among three is "+l);
}
	
	}

}
