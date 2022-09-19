// write a java program for temperature conversion
class Question3 {
    //f = c * (9/5) + 32
    public static void main(String[] args) {
        float farhenit, celcious;
        celcious = 40;
        farhenit = (celcious * 9/5) + 32;
        System.out.println("Temperature in Celcious: "+celcious);
        System.out.println("Temperature in farhenit: "+farhenit);
        farhenit = 315;
        celcious = (farhenit - 32) * 5/9;
        System.out.println("Temperature in farhenit: "+farhenit);
        System.out.println("Temperature in Celcious: "+celcious);
    }    
}
