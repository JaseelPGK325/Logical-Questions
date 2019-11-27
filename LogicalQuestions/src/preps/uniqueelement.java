package preps;
import java.util.*;
public class uniqueelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("enter size of array");
int n=s.nextInt();
int count=0;
System.out.println("enter array elements");
int a[]=new int [n];
for(int i=0;i<n;i++) {
	a[i]=s.nextInt();
}System.out.println("unique elements in array  ");
for(int i=0;i<n;i++) {
	count=0;
	for(int j=0;j<i-1;j++) {
		if(a[i]==a[j] ){
			count++;
		}
	}
	for(int k=i+1;k<n;k++) {
		if( a[i]==a[k])
		{count++;
			}
		}
	if (count==0) {
		
	System.out.println(a[i]);}
}
	}

}
