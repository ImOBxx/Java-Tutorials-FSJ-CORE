import java.util.Scanner;

public class CheckRecSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l;
		int b;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Length: ");
	    l = in.nextInt();
	    System.out.println("Enter Bredth: ");
	    b = in.nextInt();
	    
	    if (l == b)
	    {
	    	System.out.println("Rectangle Is A Square");
	    }
	    else
	    {
	    	System.out.println("Rectangle Is Not A Square");
	    }
	    
		

	}

}
