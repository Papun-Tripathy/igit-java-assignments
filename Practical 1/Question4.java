/*
* Write a java program to implement adder circuit and booth algorithm
* using bitwise operator?
*/

import java.util.Scanner;
class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean a, b, c, carry, sum;
        a = true;
        b = true;
        c = false;

        System.out.println("Half Adder");
        
        sum = a ^ b;
        carry = a & b;

        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
        System.out.println("Value of sum is: "+sum);
        System.out.println("Value of carry is: "+carry);
        
        System.out.println("Full Adder");

        carry = carry | (sum ^ c);
        sum = sum ^ c;

        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
        System.out.println("Value of c is: "+c);
        System.out.println("Value of sum is: "+sum);
        System.out.println("Value of carry is: "+carry);

        int num;

        System.out.print("Enter the number less then 16: ");
        num = in.nextInt();
    }
}
