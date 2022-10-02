import java.util.Scanner;

class Question4a {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int x, n;
        double value = 1;
        
        System.out.print("Enter the value of x: ");
        x = in.nextInt();
        System.out.print("Enter the value of n: ");
        n = in.nextInt();
        
        for(int i = 2; i <= n; i++){
            int xToPower = 1;
            for(int p = 0; p < i;p++)
                xToPower *= x;
            if(i %2 == 0) value -= xToPower/i;
            else value += xToPower/i;
        }

        System.out.println("The value is: "+value);

    }
}
