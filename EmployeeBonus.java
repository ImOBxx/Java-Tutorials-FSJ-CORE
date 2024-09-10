import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		float bs, ts = 0, hra, ta;
		System.out.println("Enter Basic Salary: ");
		bs = in.nextInt();
		if (bs >= 15000)
		{
			hra = (float) (0.45 * bs);
			ta = (float) (0.40 * bs);
			ts = hra + ta + bs;
			
		}
		else if (bs < 15000)
		{
			hra = (float) (0.40 * bs);
			ta = (float) (0.35 * bs);
			ts = hra + ta + bs;
		}
		
	System.out.println("Total Salary: " + ts);
		

	}

}
