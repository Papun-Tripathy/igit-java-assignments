import java.util.Scanner;

class Question11j {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;

        System.out.print("Enter the size: ");
        size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

        int n1 = 0, n2 = 0, count = 0, sum = 0;
        for (int i = size - 1; i > 0 && count < 2; i--) {
            if (arr[i] % 2 == 0) {
                count++;
                n1 = arr[i];
            }
        }
        count = 0;
        for (int i = 0; i < size && count < 3; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                n2 = arr[i];
            }
        }

        while (n1 > 0 || n2 > 0) {
            int d1, d2;
            d1 = n1 % 10;
            d2 = n2 % 10;
            sum += (d1 * d2);
            n1 /= 10;
            n2 /= 10;
        }
        System.out.println("the result is: "+sum);
    }
}
