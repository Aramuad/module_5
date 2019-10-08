package lab_8;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first character: ");
		char char1 = sc.next().charAt(0);
		System.out.print("Enter the second character: ");
		char char2 = sc.next().charAt(0);
		for(char c = char1; c < char2; c++) {
			for (int i = 0; i <= 5; i++) {
				System.out.println(c);
			}
			System.out.println();
		}
		sc.close();
	}
}
