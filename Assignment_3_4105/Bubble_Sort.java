// https://hack.codingblocks.com/app/contests/4105/190/problem
package Assignment_3_4105;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr);

	}

	public static void bubbleSort(int[] arr) {
		int turn = 1;
		for (; turn < arr.length; turn++) {
			for (int j = 0; j < arr.length - turn; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
