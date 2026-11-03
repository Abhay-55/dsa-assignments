// https://hack.codingblocks.com/app/contests/4035/242/problem

package Assignment_2_4035;

import java.util.Scanner;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int i = 1;
		while(i<n) {
			int temp = a;
			a = b;
			b =  b+temp;
			i++;
		}
		System.out.println(b);

	}

}
