/* Trayce Martineau
Exercise 11_3
WED Nov 6, 2019*/
import java.util.*;

class Exercise11_3 {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in); 
		//Ask for account id
		System.out.print("Enter your account number: ");
		//make an input thing for id number
		int a 						 = input.nextInt();
		//create accounts with the input being id and a balance of $100
		Account testAccount 		 = new Account (a, 100);
		SavingsAccount testSavings	 = new SavingsAccount(a, 100);
		CheckingAccount testChecking = new CheckingAccount(a, 100); 
		
		//Account toString()
		System.out.println(testAccount.toString());
		System.out.println("-----------------------------------");
		
		//Using toString() methods
		System.out.println(testSavings.toString());
		//Testing the new withdraw function for Savings account
		System.out.print("Enter Withdraw amount: ");
		double withdrawAmount = input.nextDouble();
		testSavings.withdraw(withdrawAmount);
		//testing withdraw for checking
		System.out.print("Enter Deposit Amount: ");
		double depositAmount = input.nextDouble();
		testSavings.deposit(depositAmount);
		System.out.println("New Balance: $" + testSavings.getBalance());
		System.out.println("-----------------------------------");
		
		//Using toString() methods
		System.out.println(testChecking.toString());
		//Testing the new withdraw function for Checking account
		System.out.print("Enter Withdraw amount: ");
		withdrawAmount = input.nextDouble();
		testChecking.withdraw(withdrawAmount);
		//testing Deposit for checking
		System.out.print("Enter Deposit Amount: ");
		depositAmount = input.nextDouble();
		testChecking.deposit(depositAmount);
		System.out.println("New Balance: $" + testChecking.getBalance());
		
	}
}