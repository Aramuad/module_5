package lab_9;
import java.util.Scanner;
public class Guess {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		while (!stop) {
			int guess;
			int randomNum = random();
			do {
				System.out.print(compare(guess = guess(), randomNum));
			} while (guess != randomNum);
			System.out.print("Play again? (Yes/No): ");
			String answer = sc.nextLine().trim().toLowerCase();
				if(answer.equals("yes")) {
					stop = false;
				} else if (answer.equals("no")) {
					stop = true;
				} else {
					System.out.println("Invalid entry...");
					stop = false;
				}
		}
	}
	
	private static int random() {
		double random = Math.floor(Math.random() * 20) + 1;
		return (int)random;
	}
	
	private static int guess() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess a number between 1 and 20: ");
		int guess = sc.nextInt();
		return guess;
	}
	
	private static String compare(int guess, int random) {
		String result = "";
		if (guess == random) {
			result = "Correct! ";
		} else if (guess < random) {
			result = "Too low...";
		} else if (guess > random) {
			result = "Too high...";
		}
		return result;
	}
}
