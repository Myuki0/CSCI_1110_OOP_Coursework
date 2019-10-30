/* Trayce Martineau
WED Oct 30, 2019*/
import java.util.*;

class Exercise10_7 {
	public static void main(String[] args) {
		//initialize int for user input
		int choice = 0;
		//create scanner
		Scanner input = new Scanner(System.in); 
		//Ask for account id
		System.out.print("Enter your account number: ");
		//accept input
		choice = input.nextInt();
		
		//for loop to keep the menu running 
		while(choice >= 0 && choice <= 9){
			//make i equal to the account choice, but only when it's valid
			int i = choice;
			//create an account wiht the number of the chosen account id and $100
			Account test = new Account(i, 100);	
			//print menu	
			System.out.println("Welcome, customer #" + choice + ", make a selection: ");
			System.out.println("1 - Check available balance");
			System.out.println("2 - Deposit money");
			System.out.println("3 - Withdraw money");
			System.out.println("4 - Exit to main menu");
			System.out.print("Your selection: ");
			//accept selection
			int select;
			select = input.nextInt();
			//print this because it looks cool
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//if they choose 1, print balance
			if(select == 1){
				System.out.println("Current balance: " + test.getBalance());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			//if they choose 2, ask how much they'd like to deposit
			else if(select == 2){
				System.out.print("Enter Deposit amount: ");
				double depositAmount = input.nextDouble();
				test.deposit(depositAmount);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			//if they choose 3, ask how much they'd like to withdraw
			else if(select == 3){
				System.out.println("Enter Withdraw amount: ");
				double withdrawAmount = input.nextDouble();
				test.withdraw(withdrawAmount);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			//if they choose 4, ask for the id again
			else if(select == 4){
				System.out.println("Goodbye customer #" + choice);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.print("Enter your account number: ");
				//accept input
				choice = input.nextInt();
			}
			else{
				System.out.print("Invalid choice, enter any number to return to the menu:" );
				select = input.nextInt();
			}
		}
		//Tell the user to try again if they enter a number that isn't 0 - 9
		while(choice <= 0 || choice >= 9){
			System.out.println("Invalid number entered, try again.");
			System.out.print("Enter your account number: ");
			
			choice = input.nextInt();
		}
	}
}