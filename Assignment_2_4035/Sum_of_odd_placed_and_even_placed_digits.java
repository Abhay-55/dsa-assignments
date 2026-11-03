// https://hack.codingblocks.com/app/contests/4035/25/problem
package Assignment_2_4035;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sumOfDigit(n);

	}
	
	public static void sumOfDigit(int n) {
		int sumOdd = 0;
		int sumEven = 0;
		int i = 1;
		while(n>0) {
			int digit = n%10;
			if(i%2 == 0) {
				sumEven += digit;
			}
			else {
				sumOdd += digit;
			}
			n /= 10;
			i++;
		}
		System.out.println(sumOdd);
		System.out.println(sumEven);
		
	}

}
