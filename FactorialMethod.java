import java.util.Scanner;

public class FactorialMethod {
	
	
	int factorial(int n)
	{
		int f = 1;
		for (int i = 1; i <= n; i++)
		{
			f = f * i;
		    
		}
		return f;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number: !  ");
		n = in.nextInt();
		FactorialMethod o = new FactorialMethod();
		System.out.println("Factorial Of "+ n + ": " + o.factorial(n));
		

	}

}
