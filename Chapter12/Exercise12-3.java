/*Trayce Martineau
MON Nov 11, 2019*/


import java.util.*;

class Exercise12_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int[] test 	  = new int[100];
		int index;
		
		System.out.print("Enter index value: ");
		index = input.nextInt(); 
		try{
			for(int i = 1; i < 101; i++){
				test[i] = random.nextInt();
			}
			System.out.println(test[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Out of bounds");
		}
		
	}
}