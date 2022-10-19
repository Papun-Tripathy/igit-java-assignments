import java.util.Scanner;

class Question4d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, n, count = 1;
        double result;

        System.out.print("Enter the value of x: ");
        x = in.nextInt();
        System.out.print("Enter the value of n: ");
        n = in.nextInt();

        result = x;
        for (int i = 3; i <= n; i++) {

            boolean isNotPrime = false;
            long factorialValue = 1;
            long xToPowerValue = 1;

            for (int j = 1; j <= i; j++) {

                if (j != 1 && j != i && i % j == 0) {
                    isNotPrime = true;
                }

                factorialValue *= j;
                xToPowerValue *= x;
            }
            if (isNotPrime) {
                count++;
                continue;
            }

            double calculation = (double) xToPowerValue / factorialValue;

            result = count % 2 == 0 ? result + calculation : result - calculation;
            count++;
        }

        System.out.println("The result of the series: " + result);
        in.close();
    }
}
