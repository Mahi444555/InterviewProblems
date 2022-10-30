import java.util.Scanner;

public class countnoOfdigite {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,i=0,squ=0;
		int temp,sum=0;
		temp=n;
		while(n%10>0) //here im finding how many digites number is that and then multiplying last dite by no of digite
		{
			squ=squ+1;
			
			 n=n/10;	
		}
		System.out.println(squ);
	
		while(temp>0)		//now temp storing our original value hecnce im diving that no till 0 
		{
			
			rem=n%10;
			sum=sum+rem*squ;		//just multiplying  last no by its power ie. number of digit
			temp=temp/10;
		}
		if(sum==temp) {
			System.out.println("yes its armstrong number");}
		else {
			System.out.println("not its not armstrong number");
		}
	}
}
