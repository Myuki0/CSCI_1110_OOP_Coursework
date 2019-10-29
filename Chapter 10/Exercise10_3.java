/*Trayce Martineeau
Tues OCT 29, 2019*/

import java.util.*;

class Exercise10_3 {
	public static void main(String[] args) {
		//scanner for user input
		Scanner input = new Scanner(System.in);
		//create object
		MyInteger i = new MyInteger(12);
		int[] values = {3, 6, 12};
		
		System.out.println("Value: " + i.getValue());
		//test isEven, isOdd and isPrime
		
		System.out.println("The number is EVEN:  " + i.isEven());
		System.out.println("The number is ODD:   " + i.isOdd());
		System.out.println("The number is PRIME: " + i.isPrime());
		//test equals
		
		System.out.println("Are the values equal to one another: " + i.equals(4));
		System.out.println("Are the values equal to one another: " + i.equals(new MyInteger(12)));

		//test parseInt(String)
		String testString = "hello";
		System.out.println("String converted to int: " + MyInteger.parseInt(testString));
		//test parseInt(char[])
		char[] testArray  = {'1', '3', '5'};
		System.out.println("char[] converted to int: " + MyInteger.parseInt(testArray));
		
		
		System.out.println("The number is EVEN:   "  + MyInteger.isEven(5));
		System.out.println("The number is ODD:    "   + MyInteger.isOdd(6));
		System.out.println("The number is PRIME:  " + MyInteger.isPrime(7));
		
		System.out.println("The number is EVEN:   " + MyInteger.isEven(new MyInteger(7)));
		System.out.println("The number is ODD:    " + MyInteger.isOdd(new MyInteger(7)));
		System.out.println("The number is PRIME:  " + MyInteger.isPrime(new MyInteger(7)));
	}
}