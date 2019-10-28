import java.util.*;

class Exercise10_3 {
	public static void main(String[] args) {
		MyInteger myInteger = new MyInteger(2);
		System.out.println("Even? " + myInteger.isEven());
		System.out.println("Odd? " + myInteger.isOdd());
		System.out.println("Prime? " + myInteger.isPrime());
	}
}