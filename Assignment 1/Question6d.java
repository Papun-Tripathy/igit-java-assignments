/*
 * Sum of product of consecutive even digits of any 4 digit number? Supoose
 * num=1624 then output= 4*2+2*6
 */
class Question6d {
    public static void main(String[] args) {
        int num, sum;
        int d1, d2, d3, d4;

        num = 1624;
        sum = 0;

        d1 = num / 1000;
        d2 = num / 100 % 10;
        d3 = num / 10 % 10;
        d4 = num % 10;

        sum += d1 % 2 == 0 && d2 % 2 == 0  ? d1 * d2 : 0;
        sum += d2 % 2 == 0 && d3 % 2 == 0  ? d2 * d3 : 0;
        sum += d3 % 2 == 0 && d4 % 2 == 0  ? d3 * d4 : 0;
        
        System.out.println("Sum of product of consecutive even digits: "+sum);

    }
}
