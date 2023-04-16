package ExceptionHandling;

import java.util.InputMismatchException;

//checked exception -checked at compile time

import java.util.Scanner;

//unchecked exception-checked at run time rather than compiletime



public class ConceptOfExceptionHandling {

	public static int division(int numerator, int denominator) {
		return numerator / denominator;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean contloop = true;
		do {
			try {
		System.out.println("Enter Numerator");
		int n = input.nextInt();
		System.out.println("Enter Denominator");
		int d = input.nextInt();
		
		System.out.println("The division is:" + division(n, d));
		contloop =  false;
		}
		
		catch (InputMismatchException ex) {
			
			System.err.println("Exception is "+ex);
			System.out.println("Enter proper data");
		}
			catch (ArithmeticException ex) {
			System.err.println("Arithmetic Exception is "+ex);
			System.out.println("Enter non-zero denominator");
		}
		
	}while (contloop);

}
	}
