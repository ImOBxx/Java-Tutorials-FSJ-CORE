import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i;
		int sum = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Factoria! Number: ");
		n = in.nextInt();
		for (i = 1; i <= n; i++)
		{
			sum = sum * i;
		}
		System.out.println("Factorial Of " + i + ": " + sum);

	}

}
