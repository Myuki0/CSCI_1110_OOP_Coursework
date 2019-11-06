/* Trayce Martineau
SavingsAccount extended from Account
WED Nov 6, 2019*/
import java.util.*;
public class SavingsAccount
		extends Account {
	//default account
	public SavingsAccount(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();	
	}
	//creat new savings account
	public SavingsAccount(int newId, int newBalance){
		id 			= newId;
		balance 	= newBalance;
		dateCreated = new Date();
	}
	public void withdraw(double withdrawAmount){
		if(withdrawAmount > getBalance()){
			System.out.println("CANNOT WITHDRAW MORE THAN CURRENT BALANCE");
			balance = balance;
		}
		else{
			balance = balance - withdrawAmount;			
		}	
	}
	
}