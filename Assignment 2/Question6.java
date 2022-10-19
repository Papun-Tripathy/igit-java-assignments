import java.util.Scanner;

class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, temp, x;
        boolean isPallendrum = false, isPrime = false;

        System.out.println("Enter the number: ");
        num = in.nextInt();

        temp = num;
        x = 0;
        while (temp > 0) {
            int n = temp % 10;
            x = x * 10 + n;
            temp /= 10;
        }
        if (x == num)
            isPallendrum = true;
        x = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                x++;
                break;
            }
        }
        if (x == 0)
            isPrime = true;

        if (isPrime && isPallendrum)
            System.out.println("The number " + num + " is pallendrum and prime number");
        else
            System.out.println("The number " + num + " is not a pallendrum and prime number");

        in.close();
    }
}
