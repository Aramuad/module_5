package lab_8;
import java.util.Scanner;
import java.lang.Math;
public class ComputeAreas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Do you want the area of a square, rectangle, circle, or triangle?: ");
		String input = sc.nextLine().trim().toLowerCase();
			if (input.equals("square")) {
				System.out.println();
				System.out.print("Enter the side length: ");
				double length = sc.nextDouble();
				System.out.println();
				System.out.printf("Square side: %1.1f", length);
				System.out.println();
				System.out.printf("Squarea: %1.2f", squareArea(length));
				System.out.println();
				System.out.println();
			} else if (input.equals("rectangle")) {
					System.out.println();
					System.out.print("Enter the length: ");
					double length = sc.nextDouble();
					System.out.print("Enter the width: ");
					double width = sc.nextDouble();
					System.out.println();
					System.out.printf("Rectangle side: %1.1f", length);
					System.out.println();
					System.out.printf("Rectangle width: %1.1f", width);
					System.out.println();
					System.out.printf("Rectangle area: %1.1f", rectangleArea(length, width));
					System.out.println();
					System.out.println();
			} else if (input.equals("circle")) {
					System.out.println();
					System.out.print("Enter the radius: ");
					double radius = sc.nextDouble();
					System.out.println();
					System.out.printf("Circle radius: %1.1f", radius);
					System.out.println();
					System.out.printf("Circle area: %1.3f", circleArea(radius));
					System.out.println();
					System.out.println();
			} else if(input.equals("triangle")) {
					System.out.println();
					System.out.print("Enter the base: ");
					double base = sc.nextDouble();
					System.out.print("Enter the height: ");
					double height = sc.nextDouble();
					System.out.println();
					System.out.printf("Triangle base: %1.1f", base);
					System.out.println();
					System.out.printf("Triangle height: %1.1f", height);
					System.out.println();
					System.out.printf("Triangle area: %1.2f", triangleArea(base, height));
					System.out.println();
					System.out.println();
			}
		sc.close();
	}
	private static double squareArea(double side) {
		double area = side * side;
		return area;
	}
	private static double rectangleArea(double width, double height) {
		double area = width * height;
		return area;
	}
	private static double circleArea(double radius) {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	private static double triangleArea(double base, double height) {
		double area = (base * height) / 2;
		return area;
	}
}
