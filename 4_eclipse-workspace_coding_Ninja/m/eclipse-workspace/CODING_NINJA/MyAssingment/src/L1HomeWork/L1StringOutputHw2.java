package L1HomeWork;
import java.util.Scanner;
public class L1StringOutputHw2 {

public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	
	String str=sc.next();		//here taking string from user only giving .next(); it will read only 1st token.
	System.out.println(str);
	}
 }
					/*if we write as 
					 String str=sc.nextLine(); 
					 i/p=mahesh jadhav
					 o/p=mahesh jadhav		then it will also read next word ie. string or after spaces token..
					 
					mahesh jadhav o/p=mahesh jadhav 
					
					 String str=sc.next();
					  i/p	=mahesh jadhav 
					  =o/p	=mahesh 				it will not read after space or tabs \n */