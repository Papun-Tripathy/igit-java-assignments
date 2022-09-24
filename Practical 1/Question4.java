/*
* Write a java program to implement adder circuit and booth algorithm
* using bitwise operator?
*/

import java.util.Scanner;
class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean a, b, c, carry, sum, xor;
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

        int n, m, temp, output;
        boolean dn1, dn2, dn3, dn4, dm1, dm2, dm3, dm4;

        System.out.print("Enter the number less then 16 in binary: ");
        n = in.nextInt();
        System.out.print("Enter another number less then 16 in binary: ");
        m = in.nextInt();

        temp = 0;
        carry = false;
        output = 0;

        dn1 = n / 1000 == 1 ? true : false;
        dn2 = n / 100 % 10 == 1 ? true : false;
        dn3 = n / 10 % 10 == 1 ? true : false;
        dn4 = n % 10 == 1 ? true : false;

        dm1 = m / 1000 == 1 ? true : false;
        dm2 = m / 100 % 10 == 1 ? true : false;
        dm3 = m / 10 % 10 == 1 ? true : false;
        dm4 = m % 10 == 1 ? true : false;

        xor = dn4 ^ dm4;
        sum =  xor ^ carry;
        carry = (xor & carry) | (dn4 & dm4);
        temp = temp * 10 + (sum ? 1: 0);

        xor = dn3 ^ dm3;
        sum =  xor ^ carry;
        carry = (xor & carry) | (dn3 & dm3);
        temp = temp * 10 + (sum ? 1: 0);

        xor = dn2 ^ dm2;
        sum =  xor ^ carry;
        carry = (xor & carry) | (dn2 & dm2);
        temp = temp * 10 + (sum ? 1: 0);

        xor = dn1 ^ dm1;
        sum =  xor ^ carry;
        carry = (xor & carry) | (dn1 & dm1);
        temp = temp * 10 + (sum ? 1: 0);
        output = carry ? 1 : 0; 
        output = Integer.parseInt(String.valueOf(output)+String.valueOf(temp));

        System.out.println("The value is: "+output);
        in.close();
    }
}
