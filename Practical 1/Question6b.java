class Question6b {
    public static void main(String[] args) {
        int num, sum, d1, d2, d3, d4;
        num = 4187;

        sum = 0;
        d1 = num / 1000;
        d2 = num / 100 % 10;
        d3 = num / 10 % 10;
        d4 = num % 10;
        sum += d1 % 2 != 0 ? d1 : 0;
        sum += d2 % 2 != 0 ? d2 : 0;
        sum += d3 % 2 != 0 ? d3 : 0;
        sum += d4 % 2 != 0 ? d4 : 0;

        System.out.println("The number is: " + num);
        System.out.println("Sum of the all odd digits of the number is: " + sum);
    }

}
