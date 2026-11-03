// https://hack.codingblocks.com/app/contests/4105/561/problem
package Assignment_3_4105;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		selectionSort(arr);

	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

}
