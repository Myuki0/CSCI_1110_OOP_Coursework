/* Trayce Martineau
CheckingAccount extended from Account
WED Nov 6, 2019*/
import java.util.*;
public class CheckingAccount
		extends Account {
	//default account
	public CheckingAccount(){
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
		return "Checking " + super.toString();
	}
}