package pattern;

import java.util.Scanner;

public class pattern10 {
public static void main(String args[]) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter pattern size");
	int n=s.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==j) {
			System.out.print("0 ");	
			}else {
			System.out.print(i+1+" ");}
		}System.out.println();
	}
	
	
}
}
