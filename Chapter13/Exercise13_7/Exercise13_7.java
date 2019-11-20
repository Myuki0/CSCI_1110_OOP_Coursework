import java.util.*;

class Exercise13_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		GeometricObject[] objects = new Triangle(1, 2, 3),
			new Triangle(10, 20, 30),
			new Triangle(3, 6, 9),
			new Triangle(2, 4, 6),
			new Triangle(9, 9, 12)};
		
		for(int i = 0; i < objects.length; i++){
			System.out.println(objects[i].getArea());
			System.out.println(objects[i].howToColor());
		}
	}
}