import java.util.Scanner;

public class Question1c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            num /= 10;
        }
        System.out.println("Sum of all the odd digits: " + sum);
        in.close();
    }    
}
