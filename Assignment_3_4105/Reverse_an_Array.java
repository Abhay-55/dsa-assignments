//https://hack.codingblocks.com/app/contests/4105/1366/problem
package Assignment_3_4105;

import java.util.Scanner;

public class Reverse_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		reverseArray(arr);
	}

	public static void reverseArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}

}
