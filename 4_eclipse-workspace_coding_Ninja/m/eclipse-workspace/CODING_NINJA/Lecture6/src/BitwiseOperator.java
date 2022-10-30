import java.util.Scanner;
public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
//		System.out.println(2&3);	//bitwise AND
//		System.out.println(2|3);	//bitwise OR
//		System.out.println(2^3);	//bitwise Ex-OR
//		System.out.println(~2);		//bitwise Nor/negation 
//		System.out.println(34<<1);
//		System.out.println(34>>1);
//		System.out.println(-4<<1);
//		System.out.println(-4>>1);
		
		
//		 int a = 42;
//	       int b = ~a; //(there is tilde sign before a)
//	       System.out.print(a + " " + b);  
//	    o/p= 42  -43
	       
//	       int x , y = 1;
//	         x = 10;
//	         if (x != 10 && x / 0 == 0)
//	             System.out.println(y);
//	         else
//	             System.out.println(++y);
		// o/p= 2
		
		
//		  int x = 15;
//		    int y = x++;
//		    int  z = ++x;
//		    System.out.println(y +" " + z);
//		    
//		    // o/p= 15 17
		
		
		
		
		
//		
//		 int g = 3;
//         System.out.print(++g * 8);
//        o/p= 32
		
		
		
		
		
//		int x =10;
//        int y = 20;
//        if(x++ > 10 && ++y > 20 ){		//here post increment hence firstly value is print then increment 10>10 =
//        								//false and then 10++= 11 ie. x=11 and then 2nd relation or y's value not
//        								// get increase because  in AND if first is false/0 then 2nd value not check
//        								//hence y's value not increase 0&& any thing = 0 hence else part and
//        								//      only x is increse x=11 and y as it is 20 
//        System.out.print("Inside if  ");
//        }else{
//        System.out.print("Inside else  ");
//        }
//        System.out.println(x +" "+y);
		
		//Inside else  11 20
		
		
		
		
		int x = 10;
        int y = 20;
        if(x++ > 10 || ++y > 20 ){
       System.out.print("Inside if  ");
        }else{
       System.out.print("Inside else  ");
        }
        System.out.println(x  + " " + y);
	}

}
