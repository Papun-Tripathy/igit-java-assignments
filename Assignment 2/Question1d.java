import java.util.Scanner;

public class Question1d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        while (num > 0) {
            int digit = num % 10;
            boolean isPrime = true;
            for (int i = 2; i < digit; i++) {
                if (digit % i == 0)
                    isPrime = false;
            }
            if (digit != 1 && isPrime) {
                sum += digit;
            }
            num /= 10;
        }
        System.out.println("Sum of all the prime digits: " + sum);
        in.close();
    }
}
