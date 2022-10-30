/*program for the print following pattern using while looop in java...
 _ _ _ 1
 _ _ 2 3	//here i have to print spaces also ...
 _ 4 5 6
 7 8 9 10
 */
import java.util.Scanner;
public class Patten3num {
public static void main(String[] args) 
{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int i=1;
	 int val=1;			//val is another variable which contineouly increasing...till conditon is false...
	 
	 while(i<=n)	//for printing lines...
	 {
		 int k=1;	//spaces...
		 while(k<=n-i)		//n-line number i.e. n=4 then 4-1=3 spaces will be printed...
		 {
			 System.out.print(" ");
			 k++;
		 }
		 int j=1;
		 while(j<=i)		//here printing 
		 {
			 System.out.print(val);			//here printing val..
			 val++;
			 j++;
		 }
		 System.out.println(); 			//for new line...
		 i++;
	  }
	
	}
}
