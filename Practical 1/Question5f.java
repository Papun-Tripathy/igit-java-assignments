class Question5f {
    public static void main(String[] args) {
        int num, d2, d4;
        num = 2386;
        d2 = num / 100 % 10;
        d4 = num % 10;

        System.out.println("The number is: " + num);
        System.out.println("Bitwise and of 2nd and 4th digit: " + (d2 & d4));
        System.out.println("Bitwise or of 2nd and 4th digit: " + (d2 | d4));
        System.out.println("Bitwise xor of 2nd and 4th digit: " + (d2 ^ d4));
    }
}
