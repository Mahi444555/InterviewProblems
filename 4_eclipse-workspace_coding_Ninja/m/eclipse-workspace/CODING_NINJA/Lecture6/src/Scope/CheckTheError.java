package Scope;

public class CheckTheError {

	public static void main(String[] args) {
		
		
/*
		int a = 10;
        if(a > 5) {
            int b = 10;
        }
        System.out.println(b);
        
        //these will give error because int b=10 it's valid only withing scope or it's bracket and we print 
         it out of bracket hence gives error
        
*/
		
/*
		int a = 10;
        if(a > 5) {
            a = 100;
        }
        System.out.println(a);
        
        //100
        
  */
	
		
/*		
		  int a = 10;
	        if(a > 5) {
	            int a = 100;
	        }
	        System.out.println(a);
	        //error
	        
 */
		
		
/*	
		 for(int i = 0; i < 3; i++) {
		        System.out.print(i + " ");
		        }
		    System.out.print(i + " ");
		    //error 
		    //can't use or pint two times one value
*/
		
		int a = 10;
	    while(a > 5) {
	        int b = 1;
	        System.out.print(b + " ");
	        a--;
	    }
	}
}
