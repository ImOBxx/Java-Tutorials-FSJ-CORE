
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 1;
		int c = 0;
		System.out.println(x);
		System.out.println(y);
		while (y < 50)
		{
			c = x + y;
			System.out.println(c);
			x = y;
			y = c;
			
		}

	}

}
