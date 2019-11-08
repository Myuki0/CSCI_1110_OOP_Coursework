import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Random random = new Random();
		int[] test = new int[100];
		
		for(int i = 0; i < 101; i++){
			test[i] = random.nextInt();
		}
		for(int i = 0; i < 101; i++){
			System.out.println(test[i]);
		}
	}
}