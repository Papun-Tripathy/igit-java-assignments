/*
 * find sum of product of corresponding digits of two any 4 digit
 * number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1
 */
class Question5e {
    public static void main(String[] args) {
        int num1, num2, sum;
        int n1d1, n1d2, n1d3, n1d4;
        int n2d1, n2d2, n2d3, n2d4;

        num1 = 1234;
        num2 = 7896;
        
        n1d1 = num1 / 1000;
        n1d2 = num1 / 100 % 10;
        n1d3 = num1 / 10 % 10;
        n1d4 = num1 % 10;
        
        n2d1 = num2 / 1000;
        n2d2 = num2 / 100 % 10;
        n2d3 = num2 / 10 % 10;
        n2d4 = num2 % 10;

        sum = n1d1*n2d1 + n1d2*n2d2 + n1d3*n2d3 + n1d4*n2d4;

        System.out.println("First Number: "+num1);
        System.out.println("Second Number: "+num2);
        System.out.println("Sum of product of corresponding digits of the two number is: "+sum);

    }
}
