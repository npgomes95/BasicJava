package BasicJavaProgramming;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner kybd = new Scanner(System.in);
		
		while (number!=5) {
			System.out.print("Please enter 5 to end the loop: ");
			
			
			//input validation
			if(kybd.hasNextInt()) {
				number = kybd.nextInt();
			}else {
				System.out.println("Please enter a valid number");
				kybd.nextLine();
			}
			
		}
		System.out.println("Got it!");
		

	}

}
