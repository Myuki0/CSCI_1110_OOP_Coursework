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
		SavingsAccount testSavings = new SavingsAccount(a, 100);
		CheckingAccount testChecking = new CheckingAccount(a, 100); 
		System.out.println(testChecking.toString());
		
		System.out.print("Enter Withdraw amount: ");
		double withdrawAmount = input.nextDouble();
		testSavings.withdraw(withdrawAmount);
		System.out.println("New Balance: $" + testSavings.getBalance());
		
		
		
		System.out.print("Enter Withdraw amount: ");
		withdrawAmount = input.nextDouble();
		testChecking.withdraw(withdrawAmount);
		System.out.println("New Balance: $" + testChecking.getBalance());
	}
}