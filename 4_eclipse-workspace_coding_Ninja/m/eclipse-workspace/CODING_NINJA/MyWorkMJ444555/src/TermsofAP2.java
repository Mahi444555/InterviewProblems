//these program is for find AP i.e. number ap=(3*N+2) but not divisible by ap%4==0 then don't print  
//and N is we iterating our i till N and each number of i is nothng but no between series multiplying with 3 and +2 
import java.util.Scanner;
public class TermsofAP2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		//creating object of Scanner
		int N=sc.nextInt();
		int i,ap;
		int count=0;
		
		for(i=1;count<N;i++)		//0<5 then 0 1 2 3 4 then it will iterates till 5 times
		{
			ap=(3*i)+2;				//3*1+2= 5 & here i'm only multiplying with i's value till N 
			
			if(ap%4!=0)
			{
				System.out.println(ap);
				count++;
			}
			
		}
		
	}

}
