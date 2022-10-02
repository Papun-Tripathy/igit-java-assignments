import java.util.Scanner;

class Question1k {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, temp, sumEven, sumOdd, diff;
        sumEven = sumOdd = 0;
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
            if (d1 % 2 == 0 && d2 % 2 == 0) {
                if (d1 != 2 && d1 != 6 && d2 != 2 && d2 != 6) {
                    sumEven += d1 * d2;
                }
            } else if (d1 % 2 != 0 && d2 % 2 != 0) {
                if (d1 != 3 && d1 != 7 && d2 != 3 && d2 != 7) {
                    sumOdd += d1 * d2;
                }
            }
            num /= 10;
        }
        diff = sumEven - sumOdd;
        System.out.println("The difference is: " + diff);
        in.close();
    }
}
