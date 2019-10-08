/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Aassignment:	5	←		*/

package assignment_5;
import java.util.Scanner;
public class InsultedYet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of a person you wish to insult: ");
		String name = sc.nextLine();
		String answer = "";
		boolean stop = false;
		do {
			System.out.println(insults(name));
			System.out.print("Do you want more? (Yes/No): ");
			answer = sc.nextLine().trim().toLowerCase();
			if (answer.equals("yes")) {
				stop = true;
			} else if (answer.equals("no")) {
				stop = false;
			} else {
				System.out.println("Invalid entry...");
			}
		} while(stop);
	}
	private static String insults(String name) {
		String insult = "";
		int number = (int)Math.floor(Math.random() * 5) + 1;
		switch(number) {
			case 1:
				insult = name + ", you behave like Donald Trump.";
				break;
			case 2: 
				insult = name + ", you practice religion.";
				break;
			case 3:
				insult = name + ", you drink bud light.";
				break;
			case 4:
				insult = name + ", you're a climate change denier.";
				break;
			case 5:
				insult = name + ", you're a flat-earther.";
				break;
		}
		return insult;
	}
}
