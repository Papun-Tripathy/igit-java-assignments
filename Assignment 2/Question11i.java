import java.util.Scanner;

class Question11i {
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
        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
        System.out.println("First 5 largest even numbers are: ");
        int count = 0;
        for (int i = 0; i < arr.length && count != 5; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("First 5 smallest odd numbers are: ");
        count = 0;
        for (int i = 0; i < arr.length && count != 5; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                System.out.print(arr[i] + ", ");
            }
        }

    }
}
