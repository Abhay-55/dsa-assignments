/*
				        1 
				      2 3 2 
				    3 4 5 4 3 
				  4 5 6 7 6 5 4 
				5 6 7 8 9 8 7 6 5 

 */

package Assignment_1_3988;

import java.util.Scanner;

public class Pattern_Triangle_189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int space = n-1;
		int star = 1;
		int row = 1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			int j = 1;
			int val = row;
			while(j<=star) {
				System.out.print(val+" ");
				if(j<row) {
					val++;
				}
				else {
					val--;
				}
				j++;
			}
			
			System.out.println();
			row++;
			star += 2;
			space--;
		}

	}

}
