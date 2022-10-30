package HomeWork;
import java.util.Scanner;
public class TermsOfAP2 {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i,ap;
		int count=0;
		
for(i=1;count<N;i++)
		{
			ap=(3*i)+2;		//3*1+2=5  3*3+2=11 3*5+2=17 3
		
				if(ap%4!=0)
					{
					
					System.out.print(ap+" ");
					count++;
					}		
		}
	}

}
