/*Trayce Martineau
FRI Nov 22, 2019*/

import java.util.*;

class Exercise13_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Create an array of geometric objects that are Triangles	
		GeometricObject[] objects = {
			new Triangle(19, 34, 18),
			new Triangle(15, 25, 35),
			new Triangle(6, 7, 8),
			new Triangle(18, 21, 24 ),
			new Triangle(9, 15, 12)};
		
		//for loop to print relevant information for each triangle
		for(int i = 0; i < objects.length; i++){
			System.out.println("Triangle " + (i + 1) + ":");
			System.out.println("Area: " + objects[i].getArea());
			//Using the overriden howToColor() void method to print
			((Triangle)objects[i]).howToColor();
		}
	}
}