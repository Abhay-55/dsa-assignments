// https://hack.codingblocks.com/app/contests/4105/398/problem
package Assignment_3_4105;

import java.util.Scanner;

public class Arrays_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		System.out.println(returnIndex(arr, item));
	}

	public static int returnIndex(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
