/*
		             1 
		        2 1   1 2 
		    3 2 1       1 2 3 
		4 3 2 1           1 2 3 4 
		    3 2 1       1 2 3 
		        2 1   1 2 
		            1 
 */

package Assignment_1_3988;
import java.util.Scanner;
public class Pattern_Double_Sided_Arrow_75 {


	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int row = 1;
	        int space1 = n-1;
	        int star1 = 1;
	        int space2 = -1;
	        int star2 = 1;
	        int val1 = 1;




	        while(row<=n){
	            int j = 1;
	            while(j<=space1){
	                System.out.print("  ");
	                j++;
	            }

	            int i = 1;
	            int p = val1;
	            while(i<=star1){
	                System.out.print(p+" ");
	                p--;
	                i++;
	            }

	            int k = 1;
	            while(k<=space2){
	                System.out.print("  ");
	                k++;
	            }
	            
	            if(row >1 && row < n) {
	                int l = 1;
	                int val2 = 1;
	                while(l<=star2){
	                    System.out.print(val2+" ");
	                    l++;
	                    val2++;
	                }
	            }
	            

	            if(row<=n/2){
	                space1 -= 2;
	                star1++;
	                space2 +=2;
	                star2++;
	                val1++;
	            }
	            else{
	                space1 +=2;
	                star1--;
	                space2 -=2;
	                star2--;
	                val1--;
	            }
	            row++;
	            System.out.println();
	        }


	    }
	

}
