/*

https://hack.codingblocks.com/app/contests/3988/224/problem


/*
 
			1 
			2 3 
			4 5 6 
			7 8 9 10
 */
package Assignment_1_3988;

import java.util.Scanner;

public class Pattern_Number_Ladder_224 {

	public static void main(String[] args) {
		int row = 1;
		int star = 1;
		int val = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(row<=n) {
			int i = 1;
			while(i<= star) {
				System.out.print(val+" ");
				i++;
				val++;
			}
			row++;
			star++;
			System.out.println();
		}

	}

}
