/*Trayce Martineau
MON Nov 11, 2019*/

import java.util.*;

class Exercise12_3 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int[] test 	  = new int[100];
		int index;
		//Ask the user to choose an index value
		System.out.print("Enter index value: ");
		index = input.nextInt(); 
		//randomze the array values
		try{
			for(int i = 0; i < test.length; i++){
				test[i] = random.nextInt();
			}
			//print the chosen number if it is not out of bounds
			System.out.println(test[index]);
		}
		//display the error if the chosen index is out of bounds
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Out of bounds");
		}
	}
}