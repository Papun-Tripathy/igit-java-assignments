import java.util.Scanner;

class Question1j {

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
            boolean isPrime1, isPrime2;
            isPrime1 = isPrime2 = true;

            for (int i = 2; i <= 9; i++) {
                if (d1 != i && d1 % i == 0)
                    isPrime1 = false;
                if (d2 != i && d2 % i == 0)
                    isPrime2 = false;
            }

            if (isPrime1 && isPrime2)
                sum += d1 * d2;

            num /= 10;
        }
        System.out.println("Sum of product of all consecutive odd digit: " + sum);
        in.close();
    }

}
