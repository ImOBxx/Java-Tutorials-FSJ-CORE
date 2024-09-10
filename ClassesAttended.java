import java.util.Scanner;

public class ClassesAttended {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cls;
		double att;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number Of Classes Held: ");
		cls = in.nextDouble();
		System.out.println("Enter Number Of Classes Attended: ");
		att = in.nextDouble();
		
		double per = (att / cls) * 100;
		
		System.out.println("Percentage Of Classes: " + per);
		
		if (per > 75)
		{
			System.out.println("The Student Is Allowed To Sit In the Exam.");
		}
		else
		{
			System.out.println("The Student Is Not 4Allowed To Sit In the Exam.");
		}
		
		

	}

}
