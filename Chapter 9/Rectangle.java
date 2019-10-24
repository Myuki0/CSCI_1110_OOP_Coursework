//Define circle class with two constructors
public class Rectangle{
	double width  = 1;
	double height = 1;
	
	//Construct a rectangle
	Rectangle(){
	}
	//Construct rectangle  with specified values
	Rectangle(double newWidth, double newHeight){
		width  = newWidth;
		height = newHeight;
	}
	//Return area
	double getArea(){
		return width * height;
	}
	//Return perimeter
	double getPerimeter(){
		return (width * 2) + (height * 2);
	}
}