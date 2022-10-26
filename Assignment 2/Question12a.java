class Question12a {
    public static void main(String[] args) {
        int largest, smallest;
        largest = smallest = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            if(value > largest) largest = value;
            if(value < smallest) smallest = value;
        }
        System.out.println("The difference between greatest and smallest number is: "+(largest - smallest));
    }
}
