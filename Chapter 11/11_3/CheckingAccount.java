/* Trayce Martineau
CheckingAccount extended from Account
WED Nov 6, 2019*/
import java.util.*;
public class CheckingAccount
		extends Account {
	//default account
	public CheckingAccount(){
	}
	//create new Checking account
	public CheckingAccount(int newId, int newBalance){
		super(newId, newBalance);
	}
	public String toString(){
		return "Checking " + super.toString();
	}
}