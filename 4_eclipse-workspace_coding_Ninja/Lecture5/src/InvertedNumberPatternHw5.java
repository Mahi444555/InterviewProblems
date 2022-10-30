import java.util.Scanner;
public class InvertedNumberPatternHw5 {

	public static void main(String[] args) {

	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
     int i=n;			//i=n means if n=4 then i=4
     
     while(i>=1)
     {
         int j=1;
         while(j<=i)
         {
             System.out.print(i);
             j++;
         }
         System.out.println();
         i--;
     }
     
		
	}



	}