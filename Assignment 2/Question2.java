import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1, num2, big, sum = 0;

        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();

        big = num1 > num2 ? num1 : num2;

        while (big > 0) {
            sum += (num1 % 10) * (num2 % 10);
            num1 /= 10;
            num2 /= 10;
            big /= 10; 
        }

        System.out.println("The sum of product of consecutive digits is: " + sum);
        in.close();
    }
}
