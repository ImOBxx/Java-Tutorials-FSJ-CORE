import java.util.Scanner;

public class DoubleAreaInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l;
		double b;
	    Scanner in = new Scanner (System.in);
	    System.out.println("Enter Length: ");
	    l = in.nextDouble();
	    System.out.println("Enter Breadth: ");
	    b = in.nextDouble();
	    
	    int area = (int)l * (int)b;
	    
	    System.out.println("Area Of The Rectangle: " + (int)area);
	    

	}

}
