/* Trayce Martineau
CheckingAccount extended from Account
WED Nov 6, 2019*/
import java.util.*;
public class CheckingAccount
		extends Account {
	//default account
	public CheckingAccount(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();	
	}
	//creat new Checking account
	public CheckingAccount(int newId, int newBalance){
		id 			= newId;
		balance 	= newBalance;
		dateCreated = new Date();
	}
	public void withdraw(double withdrawAmount){
		double overdraft = 500;
		if(withdrawAmount > (getBalance() + overdraft)){
			System.out.println("CANNOT WITHDRAW AMOUNT SURPASSING OVERDRAFT");
			balance = balance;
		}
		else{
			balance = balance - withdrawAmount;			
		}	
	}
	public String toString(){
		return "Checking account #" + getId() + " balance: " + getBalance();
		
	}
}