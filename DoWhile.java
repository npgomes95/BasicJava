package BasicJavaProgramming;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
	Scanner kybd = new Scanner(System.in);
	int number = 0;
	
	do {
		System.out.print("Please enter a number greater or equal to 10 to end the loop: ");
		number = kybd.nextInt();
		
	}while(number<=10);
	System.out.println("The number is greater than 10");
	
}
}
