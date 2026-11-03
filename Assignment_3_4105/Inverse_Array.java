// https://hack.codingblocks.com/app/contests/4105/21/problem
package Assignment_3_4105;

import java.util.Scanner;

public class Inverse_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read N
		int n = sc.nextInt();

		// Read the input array
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Create an array to store the inverted values
		int[] inv = new int[n];

		// Basic loop to invert the array: value becomes index, index becomes value
		for (int i = 0; i < n; i++) {
			inv[arr[i]] = i;
		}

		// Print the inverted array with space separation
		for (int i = 0; i < n; i++) {
			System.out.print(inv[i]);
			if (i < n - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();

		sc.close();
	}

}
