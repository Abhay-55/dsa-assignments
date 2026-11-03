/*
 https://hack.codingblocks.com/app/contests/3988/5/problem
 
 
					*
					**
					***
					****
					*****
 */

package Assignment_1_3988;
import java.util.*;

public class R2_Pattern_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        for(;row<=n;){
            int j = 1;
            while(j<=star){
                System.out.print("*");
                j++;
           }
            System.out.println();
           row++;
           star++;

        }

    }

}
