/*
https://hack.codingblocks.com/app/contests/3988/192/problem

			      * 
			    * * * 
			  * * * * * 
			* * * * * * * 
			  * * * * * 
			    * * * 
			      * 
*/

package Assignment_1_3988;

import java.util.Scanner;

public class Mirror_Star_Pattern_192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n/2;
		int star = 1;
		int row = 1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			
			if(row<=n/2) {
				space--;
				star +=2;
			}
			else {
				space++;
				star -= 2;
			}
			
			row++;
			System.out.println();
		}

	}

}
