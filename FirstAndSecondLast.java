
public class FirstAndSecondLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int temp = n;
		int sum = 0;
		int tsum;
		int r;
		
		int x = n / 10;
		//System.out.println(x);
		
		
		r = x % 10;
		sum += r;
		
		//System.out.println(sum);
		
		int f = temp / 10000;
		
		//System.out.println(f);
		
		tsum = sum + f;
		
		System.out.println(tsum);
		
		
		
		
		
		
		

	}

}
