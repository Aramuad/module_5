/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Aassignment:	5	←		*/

package assignment_5;
import java.util.Scanner;
public class SSPayout {

	public static void main(String[] args) {
		calculate(gather());
	}
	
	private static double[] gather() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your hourly wage: ");
		double wage = sc.nextInt();
		System.out.print("Enter your hours per week: ");
		int hours = sc.nextInt();
		double[] work = new double[] {wage, hours};
		return work;
	}
	
	private static void calculate(double[] work) {
		double wage = work[0];
		double hours = work[1];
		double earnings = wage * hours * 52;
		double tax = earnings * .062;
		System.out.println();
		System.out.printf("You will earn $%1.2f per year", earnings);
		System.out.println();
		System.out.printf("You will pay $%1.2f in Social Security tax", tax);
		System.out.println();
		System.out.println();
	}
}
