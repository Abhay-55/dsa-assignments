// https://hack.codingblocks.com/app/contests/4035/100/problem
package Assignment_2_4035;

import java.util.Scanner;

public class Print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(printReversr(n));

	}
	public static int countDigit(int n) {
		int sum = 0;
		while(n>10) {
			sum++;
			n /= 10;
		}
		return sum;
	}
	
	public static int printReversr(int n) {
		int a = countDigit(n);
		int mul = (int)(Math.pow(10,a));
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum += rem*mul;
			n/=10;
			mul /= 10;
		}
		return sum;
	}

}
