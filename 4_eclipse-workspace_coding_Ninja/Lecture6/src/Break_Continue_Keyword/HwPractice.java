package Break_Continue_Keyword;

public class HwPractice {

	public static void main(String[] args) {
/*		int i = 1;
		while(i < 5) {
		    if(i == 3) {
		        break;
		    }
		    System.out.print(i + " ");
		    i++;
		    //1 2
*/
		
/*		int i = 1;
		while(i < 5) {
		    if(i == 3) {
		        continue;
		    }
		    System.out.print(i + " ");
	    i++;
	    // 1 2 with infinite loop
	    
*/
/*		
		int i = 1;
		while(i < 3) {
		    int j = 1;
		    while(j < 5) {
		        if(j == 3) {
		            break;
		        }
		        System.out.print(j + " ");
		        j++;
		    }
		    i++;
		    
		    //1 2 1 2
	*/
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		

     }
		
   }
}