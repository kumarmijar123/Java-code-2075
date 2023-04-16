import java.util.Scanner;

public class Multiplicationtable {
	static int rows;// Fixed value, accessed in a class
	static int cols;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter rows values");
		rows = input.nextInt();// user input from keyboard

		System.out.println("Enter cols values");
		cols = input.nextInt();// user input from keyboard
        
		System.out.println("The multiplication table is:");

		int product[][] = new int[rows][cols];
		for (int i = 1; i < rows; i++) {
			System.out.println("The multiplication table is:" + i);
			for (int j = 1; j < cols; j++) {
				product[i][j] = i * j;
				System.out.print(i + " * " + j + " = " + product[i][j] + "\n");
			}
			System.out.println("_____________");
		}

	}

}
