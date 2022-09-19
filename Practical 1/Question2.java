// write a java program to find the simple interest
class Question2 {
    public static void main(String[] args) {
        float principle, rateOfInterest, SI;
        int time;

        principle = 10000;
        rateOfInterest = 8.25f;
        time = 3;

        SI = (principle * time * rateOfInterest) / 100;

        System.out.println("Principle: " + principle);
        System.out.println("Time: " + time);
        System.out.println("Rate of Intrest: " + rateOfInterest);
        System.out.println("The Simple Intrest: " + SI);

    }
}
