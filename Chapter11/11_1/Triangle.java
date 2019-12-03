/*Trayce Martineau
WED Nov 6, 2019
Triangle subclass 
Superclass: Geometric Object
*/

import java.util.*;

public class Triangle 
		extends SimpleGeometricObject {
	double side1;
	double side2;
	double side3;
	//create default triangle
	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	//create new triangle using specified values
	public Triangle(double side1, double side2, double side3){
		this.side1  = side1;
		this.side2  = side2;
		this.side3  = side3;
	}
	//return all the sides
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side1;
	}
	public double getSide3(){
		return side1;
	}
	//return the area
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	//return the perimeter
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
}