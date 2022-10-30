package L1HomeWork;
import java.util.Scanner;;
public class L1MultipleInputsHw3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	/*Scanner=Datatype, sc= variable_name and new Scanner=function
											taking input form System hence (System.in); */
		
		int a=sc.nextInt();			//taking interger
		String str=sc.next();		//taking string input from system by using scnner varible sc.
		
		System.out.print(a);
		System.out.println(str);		//here just printing that...
		
	}

}
