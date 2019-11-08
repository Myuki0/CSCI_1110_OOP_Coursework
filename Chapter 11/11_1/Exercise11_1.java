/*Trayce Martineau
WED Nov 6, 2019
Test Program for Triangle class
*/

import java.util.*;

class Exercise11_1 {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//create all the values that will be used for input
		double  mySide1;
		double  mySide2;
		double  mySide3;
		String  myColor;
		Boolean myFill = false;

		
		//accept input for the length of side 1
		System.out.print("Enter the length of side 1: ");
		mySide1 = input.nextDouble();
		//accept input for the length of side 2
		System.out.print("Enter the length of side 2: ");
		mySide2 = input.nextDouble();
		//accept input for the length of side 3
		System.out.print("Enter the length of side 3: ");
		mySide3 = input.nextDouble();
		//accept input for what color the triangle is
		System.out.print("Enter the color of your triangle: ");
		myColor = input.next();
		//accept input for whether or not it is filled
		System.out.print("Filled, true or false: ");
		myFill = input.nextBoolean();
		//create the triangle using the values entered
		Triangle myShape = new Triangle(mySide1, mySide2, mySide3);
		myShape.setColor(myColor);
		myShape.setFilled(myFill);
		//seperate the end result from the input
		for (int i = 0; i < 10; i++){
			System.out.println();
		}
		
		//Print all the information
		System.out.println(myShape.toString());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Area of the triangle: " + myShape.getArea());
		System.out.println("Perimeter of the triangle: " + myShape.getPerimeter());
		System.out.println("Triangle color: " + myShape.getColor());
		System.out.println("The triangle is filled: " + myShape.isFilled());
	}
}