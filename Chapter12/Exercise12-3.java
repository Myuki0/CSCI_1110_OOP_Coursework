/*Trayce Martineau
MON Nov 11, 2019*/


import java.util.*;

class Exercise12_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		
		System.out.print("Enter index value: ");
		int user = input.nextInt(); 
		try{
			int[] test = new int[100];
			for(int i = 1; i < 101; i++){
				test[i] = random.nextInt();
				System.out.println(test[user]);
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println(e);
		}
	}
}