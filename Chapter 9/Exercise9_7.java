/** Trayce Martineau
Wed OCT 23, 2019
Exercise 9_1 **/

import java.util.*;

class Exercise9_7 {
	public static void main(String[] args) {
		System.out.println("Account id: " + account1.id);
		
		//create an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%. 
		Account account1 = new Account(1122, 20000, 0.045);
	}
}
class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	double monthlyInterestRate = 0;
	double monthlyInterest = 0;
		
	//Construct default account
	Account(){
				
	}
	//Construct account with specififed values
	Account(int newId, double newBalance, double annualInterestRate){
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
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