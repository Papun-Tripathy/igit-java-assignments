import java.util.Scanner;

public class Question1e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, avgOdd, avgEven, avgOddCount, avgEvenCount, diff;

        avgOdd = avgEven = 0;
        avgOddCount = avgEvenCount = 0;

        System.out.print("Enter a number: ");
        num = in.nextInt();

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                if (digit % 4 != 0) {
                    avgEvenCount++;
                    avgEven += digit;
                }
            } else {
                if (digit % 3 != 0) {
                    avgOddCount++;
                    avgOdd += digit;
                }
            }
            num /= 10;
        }
        avgOdd /= avgOddCount;
        avgEven /= avgEvenCount;
        diff = avgEven - avgOdd;
        System.out.println("The difference value is: " + diff);

        in.close();
    }
}
