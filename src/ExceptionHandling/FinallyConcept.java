
package ExceptionHandling;

import java.util.InputMismatchException;

import java.util.Scanner;

public class FinallyConcept {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner input = new Scanner(System.in);
        		   try{
        			   System.out.println("Input number of interation");
        			   int it = input.nextInt();
        			   for(int i = 0; i < it; i++) {
        				   if (i == 5) {
        					   System.exit(0);
        				   }
        				   System.out.println(i);
        			   }
        		   }
           catch (InputMismatchException ex) {
        	   System.err.println(ex);
        	   
           }
           catch (Exception ex) {
        	   System.err.println(ex);
           }
           finally {
        	   System.out.println("execute");
           }
	}

}
