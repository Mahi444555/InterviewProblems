package mjTEChHUb;//my package name
import java.util.Scanner; //importing header files
import java.util.*;
public class AllEVEN_ONE_N {//my class name 

	public static void main(String[] args) {//my main

		
		Scanner sc=new Scanner(System.in);//creating Scanner object to take input from system
		int i=sc.nextInt();
		i=1;
		while(i<=10) {
			if(i%2==0) 
			{
				System.out.println(i+"\t");
				
			}
			i++;
		}
		
	}

}
