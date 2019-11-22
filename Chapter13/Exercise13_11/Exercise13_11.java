/*Trayce Martineau
FRI Nov 22, 2019*/
class Exercise13_11 {
	public static void main(String[] args) throws CloneNotSupportedException{
		Octagon octagon  = new Octagon(2);
		Octagon octagon2 = (Octagon)octagon.clone();
		System.out.println(octagon.toString());
		if(octagon.compareTo(octagon2) == 0){
			System.out.println("The Octagons are equal");
		}
		else if(octagon.compareTo(octagon2) == 1){
			System.out.println("The original octagon is larger");
		}
		else if(octagon.compareTo(octagon2) == -1){
			System.out.println("The new octagon is larger");	
		}
		else{
			System.out.println("Something is wrong!");
		}
	}
}