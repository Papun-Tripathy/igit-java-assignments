import java.util.Scanner;

class Question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];
        int greatest = 0, smallest = 0;

        System.out.print("Enter the 3 numbers: ");
        for (int i = 0; i < 3; i++)
            numbers[i] = in.nextInt();

        greatest = smallest = numbers[0];
        for (int i = 0; i < 3; i++) {
            greatest = greatest < numbers[i] ? numbers[i] : greatest;
            smallest = smallest > numbers[i] ? numbers[i] : smallest;
        }

        long factorial = 1;

        for (int i = 1; i <= greatest - smallest; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of difference between greatest and smallest number is: " + factorial);

        in.close();

    }
}
