public class ArmstrongNumber {

    public static void main(String[] args) {
        for (int i = 100; i <= 500; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        int r;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        return sum == temp;
    }
}
