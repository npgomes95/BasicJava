package BasicJavaProgramming;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kybd = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int number = kybd.nextInt();
		
		switch(number) {
		case 1:
			System.out.println("Got 1");
			break;
		case 66: 
			System.out.println("Got 66");
			break;
		default:
			System.out.println("Got something else");
		}
			
		
		

	}

}
