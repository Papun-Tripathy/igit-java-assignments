class Question5a {
    public static void main(String[] args) {
        int num, sum;
        num = 3971;

        sum = (num % 10) + (num % 100 / 10) + (num % 1000 / 100) + (num / 1000);

        System.out.println("The sum of " + num + " is: " + sum);
    }
}
