// Sum of product of consecutive digits of any 4 digit number? Supoose
// num=1234 then output= 4*3+3*2+2*1
class Question5d {
    public static void main(String[] args) {
        int num, sum, num1, num2, num3, num4;

        num = 1234;
        num1 = num / 1000;
        num2 = num / 100 % 10;
        num3 = num / 10 % 10;
        num4 = num % 10;

        sum = (num1 * num2) + (num2 * num3) + (num3 * num4);

        System.out.println("The number: " + num);
        System.out.println("Sum of product of consecutive digits: " + sum);
    }
}
