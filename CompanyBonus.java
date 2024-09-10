import java.util.Scanner;

public class CompanyBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y;
		double s;
		Scanner in = new Scanner (System.in);
		System.out.println("Years Of Service: ");
		y = in.nextInt();
		System.out.println("Enter Salary: ");
		s = in.nextInt();
		
		if (y > 5)
		{
			double x = s * 0.5;
			double t = s + x;
			System.out.println("Your Total Salary w/ 5% Bonus: " + t);
		}
		else
		{
			System.out.println("You Have Recieved No Bouns");
		}
	 
		
		

	}

}
