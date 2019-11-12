/*Trayce Martineau
MON Nov 12, 2019*/


import java.util.*;
import java.io.*;

public class Exercise12_15 {
	public static void main(String[] args) throws IOException{
		Random random  = new Random();
		int[] integers = new int [100];
		//create file object
		java.io.File file = new java.io.File("Exercise12_15.txt");
		//chceck if the file exists
		if(file.exists()){
			System.out.println("File exists");
		}
		try(java.io.PrintWriter output = new java.io.PrintWriter(file)){			
			for (int i = 0; i < 100; i++){
				integers[i] = random.nextInt();
				output.print(integers[i] + " ");
			}
		}
		//part2
		//Read and store all the values on the txt file
		Scanner input = new Scanner(file);
		for (int i = 0; i < 100; i++){
			while(input.hasNext()){
			integers[i] = input.nextInt();
			}
		}
		//
		for(int i = 0; i < integers.length - 1; i++){
			int currentMin = integers[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < integers.length; j++){
				if(currentMin > integers[j]){
					currentMin = integers[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex !=i){
				integers[currentMinIndex] = integers[i];
				integers[i] = currentMin;
			}
		}
		
		for(int i = 0; i < 101; i++){
			System.out.println(integers[i]);
		}
	}
}