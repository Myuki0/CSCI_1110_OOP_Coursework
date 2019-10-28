import java.util.*;

public class MyInteger {
	private int value;
	
	public MyInteger(int newValue){
		value = newValue;
	}
	public int getValue(){
		return value;
	}
	public Boolean isEven(){
		return isEven(value);
	}
	public Boolean isOdd(){
		return isOdd(value);
	}
	public Boolean isPrime(){
		return isPrime(value);
	}
	//Test if the value is even
	public static Boolean isEven(int value){
		return value % 2  == 0;
	}
	//Test if the calue is odd
	public static Boolean isOdd(int value){
		return value % 2 != 0;
	}
	//Test if the value is prime
	public static Boolean isPrime(int value){
		for(int i = 2; i <= value /2; ++i){
			if (value % i == 0){
				return false;
			}
		}
		return true;
	}
	public Boolean isEven(MyInteger myInteger){
		return myInteger.isEven();
	}
	public Boolean isOdd(MyInteger myInteger){
		return myInteger.isOdd();
	}
	public Boolean isPrime(MyInteger myInteger){
		return myInteger.isPrime();
	}
/*
	public Boolean equals(int value){
		return value;
	}

	public Boolean equals(MyInteger myInteger){
		return MyInteger.myInteger;
	}
	
	public char parseInt(char a, int c){
		a = '2';
		c = Integer.parseInt(String.valueOf(a));
		a = c;
		return a;
	}
	*/
	public String parseInt(String s){
		s = "300";
		int i = Integer.parseInt(s);
		return s;
	}
}