/*
 5432*
 543*1
 54*21
 5*321
 *4321
 
 */

import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		 
  		 int i,j;  
   		for(i=1;i<=n;i++)
           {// this loop is used to print lines  
    	 			for(j=1;j<=n;j++)
               {// this loop is used to print * in a line  
        				 if(i==j)  
            				System.out.print("*");  
          				 else  
          					System.out.print("0");  
     			}  
     j--;  
      System.out.print("*");  
     while(j>=1){// this loop is used to print * in a line  
         if(i==j)  
          System.out.print("*");  
         else  
          System.out.print("0");  
         j--;  
     }  
   System.out.println("");  
		
	}

	}}
