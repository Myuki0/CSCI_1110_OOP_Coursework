/*Trayce Martineau
WED Nov 6, 2019
Triangle subclass 
Superclass: Geometric Object
*/

import java.util.*;

public class Triangle 
		extends GeometricObject{
	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
		color = "white";
		filled = true;
	}
	public Triangle(double newSide1, double newSide2, double newSide3, 
		String newColor, boolean newFilled){
		side1  = newSide1;
		side2  = newSide2;
		side3  = newSide3;
		color  = newColor;
		filled = newFilled;
	}
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side1;
	}
	public double getSide3(){
		return side1;
	}
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	public String getColor(){
		return color;
	}
	public boolean getFill(){
		return filled;
	}
}