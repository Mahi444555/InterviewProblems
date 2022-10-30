import java.util.Scanner;
public class patternofzeroesstarts {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		 int n=sc.nextInt();
		 int i,j;
		 for(i=1;i<=n;i++)		//if n=4
		 {
			 for(j=1;j<=n;j++)	//1<=4 T, 2<=4 T, 3<=4 T, 4<=4 T, 5<=4 False and these j=5 now we use in next pattern
			 {
				 if(i==j)			
					 System.out.print("*");
				 else
					 System.out.print("0");
			 }
			 
			 j--;		//here now j's value is 5 which is last updated value  middle columns 5th number only *
			 System.out.print("*");		//These is our middle column which we print * 
			 
			 while(j>=1)		//here using while loop descending 2nd half till 1 i.e. 4 3 2 1 
			 {
				if (i==j)
					System.out.print("*");
				else
					System.out.print("0");
				j--;
			 }
			 
			 System.out.println(); 	//these is for new line 
		 }
	
   }
}