import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum = 0;
        System.out.print("Enter the num1: ");
        num1 = in.nextInt();
        System.out.print("Enter the num2: ");
        num2 = in.nextInt();

        while (num1 > 0 && num2 > 0) {
            int d1, d2;
            d1 = num1 % 10;
            d2 = num2 % 10;
            if (d1 % 2 == 0 && d2 % 2 != 0) {
                sum += d1 * d2;
            }
            num1 /= 10;
            num2 /= 10;
        }
        System.out.println("The sum is: "+sum);
        in.close();
    }
}
