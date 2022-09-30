class Question5c {
    public static void main(String[] args) {
        int num;
        num = 6198;

        System.out.println("The number: "+num);
        System.out.println("Value available at position 1000: "+(num/1000));
        System.out.println("Value available at position 100: "+(num/100%10));
        System.out.println("Value available at position 10: "+(num/10%10));
        System.out.println("Value available at position 1: "+(num%10));
    }
}
