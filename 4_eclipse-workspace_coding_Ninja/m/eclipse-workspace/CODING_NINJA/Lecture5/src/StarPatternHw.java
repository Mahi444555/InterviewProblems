import java.util.Scanner;
public class StarPatternHw {

	public static void main(String[] args) {
		

		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();			//accepting n's value from system 
	        int i=1;
	        
	        while(i<=n)		//i=lines iterating till n or printing n liens
	        {
	            int k=1;		//k=print spaces
	            while(k<=n-i)		//(1<=4-1) for 1st line 1<=3 then 3spaces
	            {
	            	System.out.print(" ");
	                k++;
	            }
	            int j=1;
	            while(j<=i)		// printing 1st line 1<=1 then only one star
	            {
	                System.out.print("*");
	                j++;
	            }				//till here 1st half spaces & stars ll be printed
	            			
	            j=2;			
	            
	            while(j<=i)	//2<=1 false then nothing wll print on 1st line
	            {
	                System.out.print("*");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
			
			
	}

}
