/*Trayce Martineau
FRI Nov 22, 2019*/
import java.awt.geom.*;

public class Triangle 
		extends GeometricObject implements Colorable{
	double side1;
	double side2;
	double side3;
	//create default triangle
	Triangle(){	
	}
	//create triangle with specified values
	Triangle(double side1, double side2, double side3){
		this.side1  = side1;
		this.side2  = side2;
		this.side3  = side3;
	}
	//return sides
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	//return perimeter
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	//return area
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	//Override the toString method
	public String toString(){
		return super.toString() + "\nArea: " + this.getArea() + "  Perimeter: " + getPerimeter();
	}
	//Override the howToColor method
	public void howToColor(){
		System.out.println("Color all three sides");
	}
}