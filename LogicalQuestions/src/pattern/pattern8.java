
package pattern;
import java.util.*;
public class pattern8 {
public static void main (String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter String");
	String a=s.next();
	int n=a.length();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
		char c=a.charAt(j);
		if(i>=j) {
			System.out.print(c+" ");
		}else {
			System.out.print(" ");
		}
	}System.out.println();
}}
}
