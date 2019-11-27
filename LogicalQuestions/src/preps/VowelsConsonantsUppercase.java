package preps;
import java.util.*;
public class VowelsConsonantsUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character");
			char cv=s.next().charAt(0);
			if (cv=='a'||cv=='e'||cv=='i'||cv=='o'||cv=='u')
			{
				System.out.println("The typed character "+"'"+cv+"'"+" is a Lowercase vowel");
			}else if(cv=='A'||cv=='E'||cv=='O'||cv=='I'||cv=='U') {
				System.out.println("The typed character "+"'"+cv+"'"+" is a Uppercase vowel");
			}
			else if((cv!='a'||cv!='e'||cv!='i'||cv!='o'||cv!='u')&&(cv>'a'&&cv<='z')) {
				System.out.println("The typed character "+"'"+cv+"'"+" is a Lowercase consonent");
			}else {
				System.out.println("The typed character "+"'"+cv+"'"+" is a Uppercase consonent");
					
			}
	}

}
