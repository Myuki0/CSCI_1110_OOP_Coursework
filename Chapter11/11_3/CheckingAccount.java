/* Trayce Martineau
CheckingAccount extended from Account
WED Nov 6, 2019*/
import java.util.*;
public class CheckingAccount
		extends Account {
	double overdraft = 500;
	//default account
	public CheckingAccount(){
	}
	//create new Checking account
	public CheckingAccount(int newId, int newBalance){
		super(newId, newBalance);
	}
	public void withdraw(double withdrawAmount){
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