package preparation;
import java.util.*;
public class assesm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
String s=sc.nextLine();
for(char c='A';c<='Z';c++)
{
    int count=0;
    for(int i=0;i<s.length();i++)
    {
        char x=s.charAt(i);
        if(x==c)
            count++;
    }
    if(count>0)
        System.out.println(c+"\t"+count);
}
	}

	}

