/* Trayce Martineau
SavingsAccount extended from Account
WED Nov 6, 2019*/
import java.util.*;
public class SavingsAccount
		extends Account {
	//default account
	public SavingsAccount(){	
	}
	//creat new savings account
	public SavingsAccount(int newId, int newBalance){
		super(newId, newBalance);
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
	public String toString(){
		return "Savings " + super.toString();
	}
}