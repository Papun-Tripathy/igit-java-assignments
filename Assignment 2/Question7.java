import java.util.Scanner;

class Question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, choice = 1, i = 1;
        long factorial;
        System.out.print("Enter the number: ");
        num = in.nextInt();

        System.out.println("Enter 1 for calculating factorial with for loop");
        System.out.println("Enter 2 for calculating factorial with while loop");
        System.out.println("Enter 3 for calculating factorial with do while loop");

        System.out.print("Enter your choice: ");
        choice = in.nextInt();

        switch (choice) {
            case 1:
                factorial = 1;
                for (i = 1; i <= num; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of the number " + num + " is: " + factorial);
                break;

            case 2:
                factorial = 1;
                i = 1;
                while (i <= num) {
                    factorial *= i;
                    i++;
                }
                System.out.println("Factorial of the number " + num + " is: " + factorial);
                break;

            case 3:
                factorial = 1;
                i = 1;
                do {
                    factorial *= i;
                    i++;
                } while (i <= num);
                System.out.println("Factorial of the number " + num + " is: " + factorial);
                break;
            
            default:
                System.out.println("Invalid input");
        }

        in.close();
    }
}
