import java.util.Scanner;

class Question4a {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x, n;
        double value = 1;

        System.out.print("Enter the value of x: ");
        x = in.nextInt();
        System.out.print("Enter the value of n: ");
        n = in.nextInt();

        for (int i = 2; i <= n; i++) {

            long xToPower = 1;
            long factvalue = 1;

            for (int num = 1; num <= i; num++) {
                factvalue *= num;
                xToPower *= x;
            }
            
            double calculation = (double) xToPower / factvalue;
            value = i % 2 == 0 ? value - calculation : value + calculation;
        }

        System.out.println("The value is: " + value);

        in.close();
    }
}
