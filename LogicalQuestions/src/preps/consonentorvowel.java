package preps;
import java.util.*;
public class consonentorvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter a character");
	char cv=s.next().charAt(0);
	if (cv=='a'||cv=='e'||cv=='i'||cv=='o'||cv=='u'||cv=='A'||cv=='E'||cv=='O'||cv=='I'||cv=='U')
	{
		System.out.println("The typed character "+"'"+cv+"'"+" is a vowel");
	}else {
		System.out.println("The typed character "+"'"+cv+"'"+" is a consonent");
	}
	}

}
