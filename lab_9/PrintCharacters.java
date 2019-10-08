package lab_9;
import java.util.Scanner;
public class PrintCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first character: ");
		char char1 = sc.next().charAt(0);
		System.out.print("Enter the second character: ");
		char char2 = sc.next().charAt(0);
		if (char1 > char2) {
			System.out.println("Not a valid sequence...");
			System.out.println();
			main(args);
		} else {
		System.out.println();
		System.out.println("Start character: " + char1);
		System.out.println("End character:   " + char2);
		System.out.println("Output:          ");
		System.out.println();
		int index = 0;
		for(int i = 0; i < printChars(char1, char2, count(char1, char2)).length; i++) {
			System.out.print(printChars(char1, char2, count(char1, char2))[i] + " ");
			index++;
				if (index == 5) {
					System.out.println();
					index = 0;
				}
		}
		System.out.println();
		System.out.println();
		}
		sc.close();
	}	
	
	private static char[] printChars(char char1, char char2, int i) {
		char[] output = new char[i];
			int index = 0;
			for(char c = char1; c <= char2; c++, index++) {
					output[index] = c;
			}
			
			return output;
		}
	
	private static int count(char char1, char char2) {
		int i = 0;
		for(char c = char1; c <= char2; c++) {
				i++;
		}
		return i;
	}
}
		
