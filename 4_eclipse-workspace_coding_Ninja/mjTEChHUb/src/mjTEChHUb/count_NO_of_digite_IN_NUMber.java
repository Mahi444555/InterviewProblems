package mjTEChHUb;
import java.util.Scanner;
import java.util.*;
public class count_NO_of_digite_IN_NUMber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count=0;
		while(num>0)	//num=1234 then 1234>0 true; 123>0 true; 12>0 true; 1>0 true; 0>0 false;
		{
			count++;		//0+1=1; 1+1=2; 2+1=3 and 3+1=4 and false...
			num=num/10; //1234/10=123;  123/10=12; 1/10=0
		}
		System.out.println(count);
	}

}
