// https://hack.codingblocks.com/app/contests/4035/919/problem

package Assignment_2_4035;
import java.util.*;
public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		int count = 0;
		
		while(i<n) {
			if(n%i == 0) {
				count++;
				break;
			}
			i++;
		}
		
		if(count == 1) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
		

	}

}
