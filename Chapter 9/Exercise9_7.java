/** Trayce Martineau
Wed OCT 23, 2019
Exercise 9_1 **/

import java.util.*;

class Exercise9_7 {
	public static void main(String[] args) {
		//create an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%. 
		Account account = new Account(1122, 20000, 0.045);
		System.out.println("Account ID: " + account.getId());
		System.out.println("Account balance: " + account.getBalance());
		System.out.println("Account annual interest rate: " + account.getAnnualInterestRate());
		
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Account balance: " + account.getBalance());
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
	}
}
class Account{

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	public double monthlyInterestRate;
		
	//Construct default account
	public Account(){	
	}
	//Construct account with specififed values
	public Account(int newId, double newBalance, double newAnnualInterestRate){
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
	public Date getDateCreated(Date dateCreated){
		java.util.Date date = new java.util.Date();
		return dateCreated;
	}
	//Return monthly interest rate
	public double getMonthlyInterestRate(double monthlyInterestRate){
		return annualInterestRate / 12;
	}
	//return monthly interest
	public double getMonthlyInterest(double monthlyInterest){
		monthlyInterestRate = getMonthlyInterestRate();
		return monthlyInterestRate * balance;
	}
	//remove money from the account
	public double withdraw(double withdrawAmount){
		balance = balance - withdrawAmount;
		return balance;
	}
	//add money to the account
	public double deposit(double depositAmount){
		balance = balance + depositAmount;
		return balance;
	}	
}
