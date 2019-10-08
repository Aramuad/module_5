package lab_9;
import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter a value to get the sum of its digits: ");
		int x = sc.nextInt();
		System.out.println();
		System.out.println("You entered: " + x);
		System.out.println("Sum of digigts: " + sumDigits(x));
		System.out.println();
		sc.close();
	}
	
	private static int sumDigits(int x) {
		int length = count(x);
		int sum = 0;
		for (int i = 0; i < length; i++) {
			int num = x % 10;
			x = x / 10;
			sum = sum + num;
		}
		return sum;
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
