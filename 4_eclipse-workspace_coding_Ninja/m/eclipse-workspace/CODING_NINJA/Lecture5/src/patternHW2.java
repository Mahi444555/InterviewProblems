import java.util.Scanner;		//header file / preprocessor directives which contain Scanner datatype 
public class patternHW2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=1;
		while(i<=N)			//printing liens till N where i=line number or row
		{
			int k=1;
			while(k<=N-i)		//here total N-i i.e. line number  1st line= if n=4 then 4-1=3 spaces
			{
				System.out.print(" ");		//these is for print spaces
				k++;
				
			}
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
