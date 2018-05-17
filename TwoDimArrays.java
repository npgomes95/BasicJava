package BasicJavaProgramming;

public class TwoDimArrays {
	public static void main(String[] args) {
		String[][] animals  = {{"Dog", "Cat", "Mouse"},
							{"fox","tiger","lion"}};	
		
		
		
	
		
		//looping through 2d arrays
		for(int row = 0; row<2; row++) {
			for(int col= 0; col<3; col++) {
				System.out.print(animals[row][col]+ " ");
				
			}
		System.out.println();
		}
	}

}
