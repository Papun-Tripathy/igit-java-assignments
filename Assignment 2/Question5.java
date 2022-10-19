import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, count = 0;
        double result;
        System.out.print("Enter a number: ");
        num = in.nextInt();

        int x = 0, n = 0;
        while (num > 0) {
            int t = num % 10;
            if (t % 2 == 0) {
                if (t != 2 && t != 8) {
                    x += t;
                }
            } else {
                if (t != 1 && t != 3) {
                    n += t;
                }
            }
            num /= 10;
        }
        result = x;
        for (int i = 3; i <= n; i = i + 2) {

            long factorialValue = 1;
            long xToPowerValue = 1;

            for (int j = 1; j <= i; j++) {
                factorialValue *= j;
                xToPowerValue *= x;
            }

            double calculation = (double) xToPowerValue / factorialValue;
            result = count % 2 == 0 ? result + calculation : result - calculation;
            count++;
        }

        System.out.println("The result of the series: " + result);
        in.close();
    }
}
