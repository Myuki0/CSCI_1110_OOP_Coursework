/*Trayce Martineau
Fri Oct 18, 2019
Exercise 9-7: Planning
*/
import java.util.*;

class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	double monthlyInterestRate = 0;
	double monthlyInterest = 0;
	
	
	
	Account account = new Account(6606060, 546.67);
	
	
	//Construct default account
	Account(){
		
	}
	//Construct account with specififed values
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	//Return balance
	public double getBalance(){
		return balance;
	}
	public double getId(){
		return id;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//Accessor method for dateCreated
	public Date getDateCreated(){
		java.util.Date dateCreated = account.getDateCreated();
		return dateCreated;
	}
	//Return monthly interest rate
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	//return monthly interest
	public double getMonthlyInterest(){
		double monthlyInterest = monthlyInterestRate * balance;
		return monthlyInterest;
	}
	//remove money from the account
	public double withdraw(){
		double withdrawAmount = 0;
		balance = balance - withdrawAmount;
		return balance;
	}
	//add money to the account
	public double deposit(){
		double depositAmount = 0;
		balance = balance + depositAmount;
		return balance;
	}	
}