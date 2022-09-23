/*
 * Write a java program to find sum of product of corresponding even digits of
 * first any digit number and corresponding odd digit of any 4 digit number Such as
 * n=1234 m=4567 output=4*7+2*5
 */
import java.util.Scanner;
class Question6g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m, dn1, dn2, dn3, dn4, dm1, dm2, dm3, dm4, sum;
        
        System.out.print("Enter the first Number: ");
        n = in.nextInt();
        System.out.print("Enter the second Number: ");
        m = in.nextInt();

        sum = 0;

        dn1 = n / 1000;
        dn2 = n / 100 % 10;
        dn3 = n / 10 % 10;
        dn4 = n % 10;

        dm1 = m / 1000;
        dm2 = m / 100 % 10;
        dm3 = m / 10 % 10;
        dm4 = m % 10;

        sum += dn1 %2 == 0 ? dn1 * dm1 : 0;
        sum += dn2 %2 == 0 ? dn2 * dm2 : 0;
        sum += dn3 %2 == 0 ? dn3 * dm3 : 0;
        sum += dn4 %2 == 0 ? dn4 * dm4 : 0;

        System.out.println("The sum value is: "+sum);
        in.close();
    }
}
