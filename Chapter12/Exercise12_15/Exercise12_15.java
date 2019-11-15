/*Trayce Martineau
MON Nov 12, 2019*/


import java.util.*;
import java.io.*;

public class Exercise12_15 {
	public static void main(String[] args) throws IOException{
		Random random  = new Random();
		int[] test = new int [100];
		//create file object
		java.io.File file = new java.io.File("Exercise12_15.txt");
		//chceck if the file exists
		if(file.exists()){
			System.out.println("File exists. Overwriting...");
		}
		try(java.io.PrintWriter output = new java.io.PrintWriter(file)){			
			for (int i = 0; i < 100; i++){
				test[i] = random.nextInt();
				output.print(test[i] + " ");
			}
		}
		//part2
		//Read and store all the values on the txt file
		Scanner input = new Scanner(file);
		for (int i = 0; i < 100; i++){
			while(input.hasNext()){
			test[i] = input.nextInt();
			}
		}
		//
		for(int i = 0; i < test.length - 1; i++){
			int currentMin = test[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < test.length; j++){
				if(currentMin > test[j]){
					currentMin = test[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex !=i){
				test[currentMinIndex] = test[i];
				test[i] = currentMin;
			}
		}
		
		for(int i = 0; i < test.length; i++){
			System.out.println(test[i]);
		}
	}
}