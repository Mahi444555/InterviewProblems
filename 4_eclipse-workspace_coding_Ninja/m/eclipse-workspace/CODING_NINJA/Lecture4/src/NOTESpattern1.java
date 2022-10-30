/* program for print the pattern
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1			N=5 here we are printing j value i.e. columns in descending order
5 4 3 2 1
5 4 3 2 1
 */
import java.util.Scanner;
public class NOTESpattern1 {
public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
//	while(i<=n)		//i loop iterates till N
//	{
//		int j=1; //why taking j=n because i'm decreasing my pattern till 1 
//		int k=n;				//k=n; i.e. if n=5 then k=5 and then dicrasing ...
//		while(j<=n)
//		{
//			System.out.print(k);  	//taking new variable k and directly assign n's value then decresng till 1
//			k--;
//			j++;
//		}
//		System.out.println();
//		i++;
//	}
	
	
	while(i<=n)
	{
		int j=1;
		int k=i;		//here assign the value of i to k i..e line/ row number and then in j's loop iterate 
		
		while(j<=n)
		{
			System.out.print(k);
			k++;
			j++;
		}
		System.out.println();
	i++;
	}
  }
}
