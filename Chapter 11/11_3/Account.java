/* Trayce Martineau
Account class for assignment 11_3
WED Nov 6, 2019*/
import java.util.*;

public class Account{

	public  int id;
	public  double balance;
	public  static double annualInterestRate;
	public  Date dateCreated;
	
	//Construct default account
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();	
	}
	//Construct account with specififed values
	public Account(int newId, double newBalance){
		id 			= newId;
		balance 	= newBalance;
		dateCreated = new Date();
	}
	//mutator methods
	//setter for the id
	public void setId(int newId){
		id = newId;
	}
	//setter for balance
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	//Setter for annual interest rate
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	//Return the balance
	public double getBalance(){
		return balance;
	}
	//Return the id number
	public int getId(){
		return id;
	}
	//Return the annual interest rate
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//Accessor method for dateCreated
	public String getDateCreated(){
		return dateCreated.toString();
	}
	//Return monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	//return monthly interest
	public double getMonthlyInterest(){
		return balance * (getMonthlyInterestRate() / 100);
	}

	//remove money from the account
	public void withdraw(double withdrawAmount){
		if(withdrawAmount > getBalance()){
			System.out.println("CANNOT WITHDRAW MORE THAN CURRENT BALANCE");
			balance = balance;
		}
		else{
			balance = balance - withdrawAmount;			
		}

	}
	//add money to the account
	public void deposit(double depositAmount){
		balance = balance + depositAmount;
	}	
}
