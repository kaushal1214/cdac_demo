package cdacDemo;

import java.util.Scanner;

public class CdacDemo {

	// Number of input to be taken from user
	final static int SIZE = 3;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// To store all the numbers from user
		int numbers[] = new int[SIZE]; 
		
		// Loop to handle input from User for SIZE
		for(int i=0;i<SIZE; i++ ) {
			try {
				System.out.println("Enter Number "+ (i+1) +": ");
			    int number = input.nextInt();
			    numbers[i] = number;
			}catch(Exception error) {
				System.out.println("Please enter number only");
				input.close();
				break;
			}
		}
		// Close the scanner if no exception occurs
		input.close();
		
		int max= returnMax(numbers);
		System.out.println("Maximum number is: "+ max);
	}

	private static int returnMax(int[] numbers) {
		int result = numbers[0];
		
		for(int i=1;i<SIZE;i++) {
			if(result < numbers[i])
				result=numbers[i];
		}
		return result;
	}

}
