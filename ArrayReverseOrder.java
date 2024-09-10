import java.util.Scanner;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Scanner in = new Scanner (System.in);
		int arr[] = new int[n];
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Number: ");
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
			arr1[i] = arr[10 - 1 - i];
		}
		
		System.out.println("Reversed Array: ");
		for (int i = 0; i < n; i++)
		{
			System.out.println(arr1[i] + " ");
		}
		
		
		

	}

}
