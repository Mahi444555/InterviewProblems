/*
 print following pattern using while loop in java...
       1
     2 3			//here also print lines then spaces then in columns i.e. j in that print numbers...
   3 4 5				and number always start from line number hence new variable i.e. k=i i..e line no...
 4 5 6 7*/


import java.util.Scanner;
public class numberPatternHw2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)		//printing lines i till n
		{
			int s=1;		//spaces...
			while(s<=n-i)	//1st line if n=5 then 4spces (s<=n-i) 1<=5-line no i.e.1stline
										//					then 1<=5-1=4 then 4spaces..
			{
				System.out.print(" ");
				s++;
			}
			int j=1;
			int k=i;		//here assign k to= line number i.e. i (k=i)
			while(j<=i)	//printing columns in that printing numbers from line no i.e. k
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
