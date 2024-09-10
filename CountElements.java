import java.util.Scanner;

public class CountElements {

    public static void main(String[] args) {
        // Initialize counters
        int countPositive = 0;
        int countNegative = 0;
        int countEven = 0;
        int countOdd = 0;

        Scanner in = new Scanner(System.in);

        // Loop to get 20 numbers from the user
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter Number: ");
            int n = in.nextInt();

            // Check if the number is positive or negative
            if (n > 0) {
                countPositive++;
            } else if (n < 0) {
                countNegative++;
            }

            // Check if the number is even or odd
            if (n % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Print the results
        System.out.println("The Total Number Of Positive Numbers: " + countPositive);
        System.out.println("The Total Number Of Negative Numbers: " + countNegative);
        System.out.println("The Total Number Of Even Numbers: " + countEven);
        System.out.println("The Total Number Of Odd Numbers: " + countOdd);

        // Close the scanner
        in.close();
    }
}
