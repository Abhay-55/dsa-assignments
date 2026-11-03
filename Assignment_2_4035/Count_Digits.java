// https://hack.codingblocks.com/app/contests/4035/64/problem

package Assignment_2_4035;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit = sc.nextInt();
		System.out.println(countDigit(num,digit));

	}
	public static int countDigit(int num, int digit) {
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			if(rem == digit)
			{
				sum++;
			}
			num /= 10;
		}
		return sum;

		
	}

}
