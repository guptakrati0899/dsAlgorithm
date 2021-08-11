package dsAlgorithm;

import java.util.Scanner;

public class FindYourNumber {
	

	public static void numberInMind(int range) {
		Scanner S = new Scanner(System.in);
		int lo = 0;
		int hi = range - 1;
		int mid = (lo + hi) / 2;

		System.out.println();
		System.out.println("Think of a Number in Your Mind Between 0 to " + (range - 1));

		while (lo < hi) {
			System.out.println("If Your Number in Mind is Between " + lo + " to " + mid + " Press 1 ");
			System.out.println("If Your Number in Mind is Between " + (mid + 1) + " to " + hi + " Press 2");

			int userValue = S.nextInt();
			if (userValue == 1) {

				hi = mid;
				mid = (lo + hi) / 2;

			} else if (userValue == 2) {
				lo = mid + 1;
				mid = (lo + hi) / 2;
			} else {
				System.out.println("Wrong input! \nPlease Enter Input in a Valid Range! ");
			}
		}

		System.out.println("Your number is -> " + mid + " Is I Am Right?");
		S.close();
		}


	public static void main(String[] args) { 
		int n = Integer.parseInt("5");  // TODO Auto-generated method stub
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		numberInMind(range);
 }
}
