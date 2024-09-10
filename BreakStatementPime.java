import java.util.Scanner;

public class BreakStatementPime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Enter Number: ");
		n = in.nextInt();
		int i = 1;
		int count = 0;
		while (i <= n)
		{
			if (n % i == 0)
			{
				count = count + 1;
				
			}
			i++;
		}
		if (count == 2)
		{
			System.out.println("The Number Is A Prime Number.");
		}
		else 
		{
			System.out.println("The Number Is Not A Prime Number.");
		}

	}

}
