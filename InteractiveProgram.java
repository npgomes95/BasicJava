package BasicJavaProgramming;

import java.util.Scanner;

public class InteractiveProgram {
	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		System.out.print("What is the number? ");
		int number = kybd.nextInt();
		
		if(number>=10){
			System.out.println("The number is big enough");
		}else if(number<10) {
			System.out.println("The number is too small");
		}
		
		
	}

}
