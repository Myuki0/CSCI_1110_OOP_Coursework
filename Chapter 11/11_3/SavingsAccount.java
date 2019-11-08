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
		id 			= newId;
		balance 	= newBalance;
		dateCreated = new Date();
	}
	public String toString(){
		return "Savings " + super.toString();
	}
}