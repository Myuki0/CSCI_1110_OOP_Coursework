/*Trayce Martineau
WED Oct 30, 2019*/
import java.util.*;

class Exercise10_7 {
	public static void main(String[] args) {
		//initialize each account with balance 100
		Account[] test = new Account[10];
		for(int i = 0; i < 10; i++){
			test[i] = new Account(i, 100);
		}
		//create scanner
		Scanner input = new Scanner(System.in); 
		//Ask for account id
		System.out.print("Enter your account number: ");
		//accept input
		int a = input.nextInt();
		//Tell the user to try again if they enter a number that isn't 0 - 9
		while(a <= 0 || a >= 9){
			System.out.println("Invalid number entered, try again.");
			System.out.print("Enter your account number: ");
			
			//accept input
			a = input.nextInt();
		}
		
		//print menu	
		System.out.println("Welcome, customer #" + a + ", make a selection: ");
		System.out.println("1 - Check available balance");
		System.out.println("2 - Deposit money");
		System.out.println("3 - Withdraw money");
		System.out.println("4 - Exit");
		System.out.print("Your selection: ");
		//accept selection
		int select = input.nextInt();
		//for loop to keep the menu running 
		while(select != 4){
			//print this because it looks cool
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//if they choose 1, print balance
			if(select == 1){
				System.out.println("Current balance: $" + test[a].getBalance());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			//if they choose 2, ask how much they'd like to deposit
			else if(select == 2){
				System.out.print("Enter Deposit amount: ");
				double depositAmount = input.nextDouble();
				test[a].deposit(depositAmount);
				System.out.println("New Balance: $" + test[a].getBalance());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			//if they choose 3, ask how much they'd like to withdraw
			else if(select == 3){
				System.out.print("Enter Withdraw amount: ");
				double withdrawAmount = input.nextDouble();
				test[a].withdraw(withdrawAmount);
				System.out.println("New Balance: $" + test[a].getBalance());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			//if they choose 4, end the program
			else if(select == 4){
				System.out.println("Goodbye customer #" + a);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			//if they enter anything that isn't 1 - 4, reprompt
			else{
				System.out.println("Invalid number entered, try again.");
			}
			//print menu	
			System.out.println("Welcome, customer #" + a + ", make a selection: ");
			System.out.println("1 - Check available balance");
			System.out.println("2 - Deposit money");
			System.out.println("3 - Withdraw money");
			System.out.println("4 - Exit to main menu");
			System.out.print("Your selection: ");
			//accept selection
			select = input.nextInt();
		}
	}
}