/*Trayce Martineau
FRI Nov 22, 2019*/
import java.math.*;
import java.lang.Cloneable;

public class Octagon 
		extends GeometricObject implements Cloneable, Comparable<Octagon> {
	double sides;
	
	Octagon(){
	}
	Octagon(double sides){
		this.sides = sides;
	}
	
	public double getSides(){
		return sides;
	}
	public double getPerimeter(){
		return sides * 8;
	}
	public double getArea(){
		return 2 * (1 + Math.sqrt(2) * Math.pow(sides, 2));
	}
	@Override
	public String toString(){
		return super.toString() + " | Area: " + getArea(); 
	}
	@Override
	public int compareTo(Octagon o){
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}