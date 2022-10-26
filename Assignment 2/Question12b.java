class Question12b {
    public static void main(String[] args) {
        
        int avgOdd = 0, avgEven = 0, oddCount = 0, evenCount = 0;
        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            if(value%2 == 0){
                evenCount++;
                avgEven += value;
            } else {
                oddCount++;
                avgOdd += value;
            }
            System.out.println("avgEven"+avgEven);
            System.out.println("avgOdd"+avgOdd);
        }
        avgEven /= evenCount;
        avgOdd /= oddCount;

        System.out.println("difference between average of all odd numbers and even numbers is: "+(avgEven-avgOdd));

    }
}