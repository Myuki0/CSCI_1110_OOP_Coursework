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
		//accept input
		int a = input.nextInt();
		Account testAccount = new Account (a, 100);
		SavingsAccount testSavings = new SavingsAccount(a, 100);
		CheckingAccount testChecking = new CheckingAccount(a, 100); 
		System.out.println(testAccount.toString());
		/*System.out.print("Enter Withdraw amount: ");
		double withdrawAmount = input.nextDouble();
		testAccount.withdraw(withdrawAmount);
		System.out.println("New Balance: $" + testAccount.getBalance());
		*/
		
		//Using toString() methods
		System.out.println(testSavings.toString());
		//Testing the new withdraw function for Savings account
		/*System.out.print("Enter Withdraw amount: ");
		double withdrawAmount = input.nextDouble();
		testSavings.withdraw(withdrawAmount);
		System.out.println("New Balance: $" + testSavings.getBalance());
		*/
		//Using toString() methods
		System.out.println(testChecking.toString());
		//Testing the new withdraw function for Checking account
		/*System.out.print("Enter Withdraw amount: ");
		withdrawAmount = input.nextDouble();
		testChecking.withdraw(withdrawAmount);
		System.out.println("New Balance: $" + testChecking.getBalance());
		*/
	}
}