package pattern;
import java.util.*;
public class ccsskk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
//System.out.println("enter pattern size");
int n=6;
for(int i=0;i<6;i++) {
	for(int j=0;j<6;j++) {
		if(i==0) {
			System.out.print("c");
			
		}
		else if(i==1){
			if(j==2||j==3) {
				System.out.print("s");
		}else {
			System.out.print("c");
		}}
			else if(i==2||i==3) {
		
			System.out.print("s");
		}
			else if(i==4) {
			if(j==3||j==2) {
				System.out.print("s");
			}else {
				System.out.print("k");
			}
			
		}else {
			System.out.print("k");
		}
	}System.out.println();
}
	}

}
