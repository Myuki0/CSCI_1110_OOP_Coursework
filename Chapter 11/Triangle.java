public class Triangle 
		extends GeometricObject{
	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(double newSide1, double newSide2, double newSide3, 
		String color, boolean filled){
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
		
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
	public double getArea(double area){
		double s = (side1 + side2 + side3) / 2;
		return area = s;
	}
	public double getPerimeter(double perimeter){
		return side1 + side2 + side3;
	}
	public String toString(String a){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	public String getColor(String newColor){
		return color;
	}
	public boolean getFilled(boolean filled){
		return filled;
	}
}