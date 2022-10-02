import java.util.Scanner;

class Question1h {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, temp, sum = 0;
        System.out.print("Enter the number: ");
        num = in.nextInt();

        while (num > 0) {
            temp = num;
            int d1, d2;
            d1 = temp % 10;
            temp /= 10;
            if (temp == 0) {
                break;
            }
            d2 = temp % 10;

            if (d1 % 2 == 0 && d2 % 2 == 0)
                sum += d1 * d2;

            num /= 10;
        }
        System.out.println("Sum of product of all consecutive even digit: " + sum);
        in.close();
    }
}
