package pattern;

import java.util.Scanner;

public class namefirstletterstar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter character");
	char c=sc.next().charAt(0);
	if(c=='s'||c=='S') {
		for(int i=0;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j==1||i+j==3||i+j==5) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			
		}
		
	}
	else {
		System.out.println("please enter 's' or 'S'");
	
	}
	}

}
