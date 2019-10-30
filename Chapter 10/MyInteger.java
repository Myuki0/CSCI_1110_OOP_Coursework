/*Trayce Martineeau
/*Trayce Martineeau
Tues OCT 29, 2019*/
import java.util.*;

public class MyInteger {
	public int value;
	
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
	public static Boolean isEven(int num){
		return num % 2  == 0;
	}
	//Test if the value is odd
	public static Boolean isOdd(int num){
		return num % 2 != 0;
	}
	//Test if the value is prime
	public static Boolean isPrime(int num){
		for(int i = 2; i <= num /2; ++i){
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}
	public static Boolean isEven(MyInteger myInteger){
		return myInteger.isEven();
	}
	public static Boolean isOdd(MyInteger myInteger){
		return myInteger.isOdd();
	}
	public static Boolean isPrime(MyInteger myInteger){
		return myInteger.isPrime();
	}
	public Boolean equals(int value){
		return value == this.value;
	}
	public Boolean equals(MyInteger myInteger){
		return myInteger.value == value;
	}
	
	public static int parseInt(char[] a){
		int total = 0;
		for(int i = 0; i < a.length; i++){
			total += a[i] - 48;
		}
		return total;
	}
	public static int parseInt(String s){
		int total2 = parseInt(s.toCharArray());
		return total2;
	}
}