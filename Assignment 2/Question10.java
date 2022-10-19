import java.util.Scanner;

class Question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, a, b, c, terms = 2;
        a = 0;
        b = 1;

        System.out.print("Enter the value of n: ");
        num = in.nextInt();

        System.out.print(a + ", " + b);
        while (terms <= num) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
            terms++;
        }

        in.close();
    }
}
