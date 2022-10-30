package mjTEChHUb;
import java.util.Scanner;//it includes scanner 
import java.util.*;	//it include all sorting methods and many more
public class Print_Table {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int mul=sc.nextInt();
		int a;
		int i=1;
		while( i<=10) {
			
			a=mul*i;
			System.out.println(a+"\t");
			i++;
		}
		
	}

}
