/** Trayce Martineau
Fri Oct 18, 2019
Exercise 9_1 **/

class Exercise9_1{
	public static void main(String[] args) {
		class Rectangle{
			//Width and height
			double width  = 1;
			double height = 1;
			//construct a rectangle
			Rectangle(){
			}
			//Construct a new rectangle
			Rectangle(double newHeight, double newWidth){
				height = newHeight;
				width  = newWidth;
			}
			//return the area of the rectangle	
			double getArea(){
				return width * height;
			}
			//return the perimeter of the rectangle
			double getPerimeter(){
				return (width * 2) + (height * 2);
			}
		}
	}
}