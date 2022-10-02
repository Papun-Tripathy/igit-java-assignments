import java.util.Scanner;

class Question1a{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of all the digits: "+sum);
        in.close();
    }
}