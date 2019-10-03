package lab_8;
import java.util.Scanner;
public class PalindromeInteger {

	public static void main(String[] args) {
		isPalindrome();
	}	
	
	private static void isPalindrome() {
		int[] arr = input();
		int[] reversedArr = reverse(arr);
		int number = 0;
			for(int i = 0; i < reversedArr.length; i++) {
				number = (number * 10) + reversedArr[i];
			}
		if (number == arr[0]) {
			System.out.println();
			System.out.println("Entered value:   " + number);
			System.out.println("Judgment:        Palindrome");
			System.out.println();
		} else {
			System.out.println();
			System.out.println("Entered value:   " + arr[0]);
			System.out.println("Judgement:       Not palindrome");
			System.out.println();
		}
	}
	
	private static int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		int[] arr = new int[] {x, count(x)};
		sc.close();
		return arr;
	}
	
	private static int[] reverse(int x[]) {
		int[] arr = new int[2];
		arr[0] = x[0];
		arr[1] = x[1];
		int[] arr1 = new int[arr[1]];
		for (int i = 0; i < arr[1]; i++) {
			arr1[i] = arr[0] % 10;
			arr[0]= arr[0] / 10;
		}
		return arr1;
	}
	
	private static int count(int x) {
		int counter = 0;
		while(x > 0) {
			x = x / 10;
			counter++;
		}
		return counter;
	}
}
