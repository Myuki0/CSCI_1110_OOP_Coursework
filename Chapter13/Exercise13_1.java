/*Trayce Martineau
MON Nov 18, 2019*/
import java.util.*;

class Exercise13_1 {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter length of Side1: ");
		double a = input.nextDouble();
		System.out.print("Enter length of Side2: ");
		double b = input.nextDouble();
		System.out.print("Enter length of Side3: ");
		double c = input.nextDouble();
		System.out.print("Enter Triangle Color: ");
		String d = input.next();
		System.out.print("Triangle filled, True or False: ");
		Boolean e = input.nextBoolean();
		Triangle testTriangle = new Triangle(a, b, c, d, e);
	}
}