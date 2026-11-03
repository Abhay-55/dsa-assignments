/*
 http://hack.codingblocks.com/app/contests/3988/231/problem
 			    *****
			   *   *
			  *   *
			 *   *
			*****
 
 */

package Assignment_1_3988;

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space1 = n-1;
		int star = 1;
		int space2 = 3;
		while(row<=n) {
			int i = 1;
			while(i<=space1) {
				System.out.print(" ");
				i++;
			}
			
			System.out.print("*");
			
			int k = 1;
			while(k<=space2) {
				if(row == 1 || row == n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				k++;
			}
			System.out.print("*");
			
			row++;
			space1--;
			System.out.println();
		}

	}

}
