import java.util.Scanner;

class Question11h {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;

        System.out.print("Enter the size of the array: ");
        size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int biggestEven, smallestOdd, diff;
        biggestEven = smallestOdd = arr[0];
        for (int i : arr) {
            if (i % 2 == 0) {
                if (i > biggestEven)
                    biggestEven = i;
            } else {
                if (i < smallestOdd)
                    smallestOdd = i;
            }
        }
        int temp, rev = 0;
        temp = diff = biggestEven - smallestOdd;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if (rev == diff)
            System.out.println("The difference between largest even number and smallest odd number is palindrome");
        else
            System.out
                    .println("The difference between largest even number and smallest odd number is not a palindrome");

        in.close();
    }
}
