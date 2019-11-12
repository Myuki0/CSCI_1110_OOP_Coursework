import java.util.*;
import java.io.*;

public class WriteData {
	public static void main(String[] args) throws IOException{
		Random random  = new Random();
		int[] integers = new int [100];
		//create file object
		java.io.File file = new java.io.File("Exercise12_15.txt");
		//chceck if the file exists
		if(file.exists() == true){
			System.out.println("File exists");
		}
		//create the actual test file
		java.io.PrintWriter output = new java.io.PrintWriter(file);			
		/*for (int i = 0; i < 100; i++){
			integers[i] = random.nextInt();
			output.print(integers[i] + " ");
		}*/
		output.println("howdy");
	}
}