import java.util.Scanner;

public class AverageThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		double avg;
		System.out.println("Average: ");
		System.out.println("\n");
		Scanner in = new Scanner (System.in);
		System.out.print("Enter 1st Number: ");
		a = in.nextInt();
		System.out.print("Enter 2nd Number: ");
		b = in.nextInt();
		System.out.print("Enter 3rd Number: ");
		c = in.nextInt();
		System.out.println("\n");
		avg = (a + b + c) / 3.0;
		System.out.println("The Average Of Three Numbers: " + avg);
		
		

	}

}
