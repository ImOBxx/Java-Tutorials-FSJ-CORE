import java.util.Scanner;

public class CirRadius {
	
	double cir(int r)
	{
		return 2 * Math.PI * r;
	}
	
	double area(int r)
	{
		return Math.PI * r * r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		CirRadius o = new CirRadius();
		int r;
		System.out.println("Enter Radius: ");
		r = in.nextInt();
		System.out.println("Circumference: " + Math.round(o.cir(r)));
		System.out.println("Area: " + o.area(r));
		
		}

}
