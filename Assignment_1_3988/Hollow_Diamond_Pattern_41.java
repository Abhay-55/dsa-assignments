package Assignment_1_3988;

import java.util.Scanner;

public class Hollow_Diamond_Pattern_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star1 = n/2+1;
		int space = -1;
		int star2 = n/2 +1;
		
		while(row<=n) {
			int i = 1;
			while(i<=star1) {
				System.out.print("* ");
				i++;
			}
			
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			


			int k = 1;
			int p = star2;
			if(row == 1 || row == n) {
				p -= 1;
			}
			while(k<=p) {
				System.out.print("* ");
				k++;
			 }
			
			
			if(row<= n/2) {
				star1--;
				star2--;
				space +=2;
			}
			else {
				star1++;
				star2++;
				space  -=2;
			}

			System.out.println();
			row++;
		}
				
			
		

	}

}
