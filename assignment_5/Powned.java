/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Aassignment:	5	←		*/

package assignment_5;
import java.util.Scanner;
public class Powned {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to convert to leet: ");
		String phrase = sc.nextLine().trim().toLowerCase();
		String [] leetPhrase = converter(phrase);
		System.out.println();
		for (int i = 0; i < leetPhrase.length; i++) {
			System.out.print(leetPhrase[i]);
		}
		System.out.println();
		System.out.println();
	}
	private static String[] converter(String phrase) {
		String[] convert = new String[phrase.length()];
		for (int index = 0; index < phrase.length(); index++) {
			switch (phrase.charAt(index)) {
			case 'a':
				convert[index] = "4";
				break;
			case 'b':
				convert[index] = "B";
				break;
			case 'c':
				convert[index] = "(";
			case 'd':
				convert[index] = "D";
			case 'e':
				convert[index] = "3";
				break;
			case 'f':
				convert[index] = "Ph";
				break;
			case 'g':
				convert[index] = "9";
				break;
			case 'h':
				convert[index] = "|-|";
				break;
			case 'i':
				convert[index] = "1";
				break;
			case 'j':
				convert[index] = "j";
				break;
			case 'k':
				convert[index] = "|<";
				break;
			case 'l':
				convert[index] = "L";
				break;
			case 'm':
				convert[index] = "/\\/\\";
				break;
			case 'n':
				convert[index] = "|\\|";
				break;
			case 'o':
				convert[index] = "0";
				break;
			case 'p':
				convert[index] = "P";
				break;
			case 'q':
				convert[index] = "Q";
				break;
			case 'r':
				convert[index] = "R";
				break;
			case 's':
				convert[index] = "$";
				break;
			case 't':
				convert[index] = "7";
				break;
			case 'u':
				convert[index] = "U";
				break;
			case 'v':
				convert[index] = "\\/";
				break;
			case 'w':
				convert[index] = "\\/\\/";
				break;
			case 'x':
				convert[index] = "><";
				break;
			case 'y':
				convert[index] = "`/";
				break;
			case 'z':
				convert[index] = "Z";
				break;
			case ' ':
				convert[index] = " ";
			}
		}
		return convert;
	}
}
