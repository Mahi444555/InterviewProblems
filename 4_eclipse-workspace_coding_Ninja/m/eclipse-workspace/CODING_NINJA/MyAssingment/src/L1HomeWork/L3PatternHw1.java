package L1HomeWork;
import java.util.Scanner;
public class L3PatternHw1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//Scanner=datatype sc=variablename,new Scanner=Function that acpt values frm sys
	
		
		int n=sc.nextInt();
		int i,j,k;
		
		for(i=1;i<=n;i++)
		{
		
			for(j=i;j<=(i*2)-1;j++)		//my j is start from line no i.e. i and till run (i*2)-1
			{
				System.out.print(j);		//printing j 
			}
		System.out.println();		//these is only for print new line  
		}
	}
}
