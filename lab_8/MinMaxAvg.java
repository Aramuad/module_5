package lab_8;
import java.util.Scanner;
public class MinMaxAvg {

	public static void main(String[] args) {
		int[] arr = gather();
		System.out.println();
		System.out.print("You entered:    " + arr[0] + ", " + arr[1] + ", " + arr[2]);
		System.out.println();
		System.out.print("Max value:      " + max(arr[0], arr[1], arr[2]));
		System.out.println();
		System.out.print("Min value:      " + min(arr[0], arr[1], arr[2]));
		System.out.println();
		System.out.print("Average value:  " + (int)average(arr[0], arr[1], arr[2]));
		System.out.println();
		System.out.println();
	}
	private static int[] gather() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the first integer: ");
		int x = sc.nextInt();
		System.out.print("Enter the second integer: ");
		int y = sc.nextInt();
		System.out.print("Enter the third integer: ");
		int z = sc.nextInt();
		int[] arr = new int[] {x, y, z};
		sc.close();
		return arr;
	}
	private static int max(int x, int y, int z) {
		int[] arr = new int[] {x, y, z};
		int maxVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(maxVal < arr[i]) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	private static int min(int x, int y, int z) {
		int[] arr = new int[] {x, y, z};
		int minVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(minVal > arr[i]) {
				minVal = arr[i];
			}
		}
		return minVal;
	}
	private static double average(double x, double y, double z) {
		double ave = (x + y + z) / 3;
		return ave;
	}
}
