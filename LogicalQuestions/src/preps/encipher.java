package preps;
import java.util.*;
public class encipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter a plain text");
	String plain=s.next();
	System.out.println("enter number- shift");
	int shift=s.nextInt();
	String cipher="";
	int l=plain.length();
	for(int i=0;i<l;i++) {
		char c=plain.charAt(i);
		if(c<='z'&&c>='a') {
			c=(char)(c+shift);
			if(c>'z') {
				c=(char)(c+'a'-'z'-1);
			
		}
			cipher=cipher+c;
			
	}else if(c<='Z'&&c>='A') {
		c=(char) (c+shift);
		
	
		if(c>'Z') {
			c=(char) ('A'-'Z'-1);
		}cipher=cipher+c;
	}else {
		cipher=cipher+c;
	}
		
	}
	System.out.println(cipher);
	}}
