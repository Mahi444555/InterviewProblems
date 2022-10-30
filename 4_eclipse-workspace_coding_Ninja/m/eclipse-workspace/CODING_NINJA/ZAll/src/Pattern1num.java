/*Program for print following pattern..
1										on 1st line= print 1
1 2										on 2nd line= print 1 2
1 2 3									on 3rd line= print 1 2 3 
1 2 3 4									on 4th line= print 1 2 3 4 which means we are printings columns i.e.
1 2 3 4 5								vertical number till line numbers (j<=i)*/									

import java.util.Scanner;	//header files which include Scanner datatype...
public class Pattern1num {
public static void main(String[] args)	//My main Functions...
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();					//taking n's value form system...
	int i=1;
	
	while(i<=n)		//these loop for i=lines printings lines till n...
	{
		int j=1;		//j is iterates till only line numbers...
		while(j<=i)		// j=columns and in that printing numbers or j's value...
		{
			System.out.print(j);
			j++;
		}
		System.out.println();	//for print new lines..
		i++;
	 }
	
	}
}
