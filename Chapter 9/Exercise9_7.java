/* Trayce Martineau
Account test class
Thu OCT 24, 2019
*/

import java.util.*;

class Exercise9_7 {
	public static void main(String[] args) {
		//create an Account object with an account ID of 1122, a balance of $20,000
		Account account = new Account(1122, 20000);
		//set annual interest rate to 4.5%
		account.setAnnualInterestRate(4.5);
		//withdraw 2500 ffrom the balance
		account.withdraw(2500);
		//deposit 3000 into the balance
		account.deposit(3000);
		
		//print the account balance, monthly interest and the date the account was created
		System.out.println("Account balance: "    + account.getBalance());
		System.out.println("Monthly Interest: "   + account.getMonthlyInterest());
		System.out.println("Account created on: " + account.getDateCreated());

	}
}
