/** Trayce Martineau
Fri Oct 18, 2019
Exercise 9_1 **/
import java.util.Scanner;

class Exercise9_1 {
	public static void main(String[] args) {
		//Create rectangle with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40); 
		//Create rectangle with width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		//print information about rectangle 1
		System.out.println("Width     of rectangle 1: "     + rectangle1.width);
		System.out.println("Height    of rectangle 1: "     + rectangle1.height);
		System.out.println("Area      of rectangle 1: " 	+ rectangle1.getArea());
		System.out.println("Perimeter of rectangle 1: " 	+ rectangle1.getPerimeter());
		System.out.println();
		//print information about rectangle 2
		System.out.println("Width     of rectangle 2: "     + rectangle2.width);
		System.out.println("Height    of rectangle 2: "     + rectangle2.height);
		System.out.println("Area      of rectangle 2: " 	+ rectangle2.getArea());
		System.out.println("Perimeter of rectangle 2: " 	+ rectangle2.getPerimeter());
	}
}
