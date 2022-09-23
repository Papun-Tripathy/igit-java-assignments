/*
 * Difference between Sum of product of consecutive even digits except 2
 * and 6 and Sum of product of consecutive odd digits except 3 and 7 of any 4 digit
 * number
 */

import java.util.Scanner;
class Question6f {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, d1, d2, d3, d4, sumOdd, sumEven, diff;

        System.out.println("Enter the 4 digit Number: ");
        num = in.nextInt();

        diff = 0;
        sumOdd = 0;
        sumEven = 0;

        d1 = num / 1000;
        d2 = num / 100 % 10;
        d3 = num / 10 % 10;
        d4 = num % 10;
        
        sumEven += ( d1 % 2 == 0 && d1 != 2 && d1 != 6 ) && ( d2 % 2 == 0 && d2 != 2 && d2 != 6 ) ? d1 * d2 : 0;
        sumEven += ( d2 % 2 == 0 && d2 != 2 && d2 != 6 ) && ( d3 % 2 == 0 && d3 != 2 && d3 != 6 ) ? d2 * d3 : 0;
        sumEven += ( d3 % 2 == 0 && d3 != 2 && d3 != 6 ) && ( d4 % 2 == 0 && d4 != 2 && d4 != 6 ) ? d3 * d4 : 0;

        sumOdd += ( d1 % 2 != 0 && d1 != 3 && d1 != 7 ) && ( d2 % 2 != 0 && d2 != 3 && d2 != 7 ) ? d1 * d2 : 0;
        sumOdd += ( d2 % 2 != 0 && d2 != 3 && d2 != 7 ) && ( d3 % 2 != 0 && d3 != 3 && d3 != 7 ) ? d2 * d3 : 0;
        sumOdd += ( d3 % 2 != 0 && d3 != 3 && d3 != 7 ) && ( d4 % 2 != 0 && d4 != 3 && d4 != 7 ) ? d3 * d4 : 0;
        
        diff = sumEven - sumOdd;
        
        System.out.println("The difference is: "+diff);
        in.close();
    }
}
