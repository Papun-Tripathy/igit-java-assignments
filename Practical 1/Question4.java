/*
 * Write a java program to implement adder circuit and booth algorithm
 * using bitwise operator?
 */
class Question4 {
    public static void main(String[] args) {
        boolean a, b, c, carry, sum;
        a = true;
        b = true;
        c = false;

        sum = a ^ b;
        carry = a & b;

        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
        System.out.println("Value of c is: "+c);
        System.out.println("Value of sum is: "+sum);
        System.out.println("Value of carry is: "+carry);
    }
}
