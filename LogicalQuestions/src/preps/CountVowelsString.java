package preps;
import java.util.*;
public class CountVowelsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter string");
String str=s.next();
int count=0;
for(int i=0;i<str.length();i++) {
	char aa=str.charAt(i);
	if((aa=='a')||aa=='e'||aa=='i'||aa=='o'||aa=='u'||aa=='A'||aa=='E'||aa=='I'||aa=='O'||aa=='U') {
		count++;
	}
}System.out.println("count of vowels in given string is "+count);
	}

}
