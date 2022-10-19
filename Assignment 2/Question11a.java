class Question11a {
    public static void main(String[] args) {
        int start = 23, end = 249, count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                int digit = i % 10;
                if (digit == 0 || digit == 4)
                    count++;
            }
        }
        System.out.println("There is total " + count + " number of even numbers that ends with 0 and 4");
    }
}
