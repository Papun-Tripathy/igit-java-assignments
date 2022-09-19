/*
 * Difference between average of all even digits except divisible by 4 and
 * avearge of all odd digits except divisble by 3 of any 4 digit number
 */

class Question6c {
    public static void main(String[] args) {
        int num, d1, d2, d3, d4;
        int avgEvenCount = 0, avgOddCount = 0;
        float diff, avgEven, avgOdd;
        num = 6275;
        
        d1 = num / 1000;
        d2 = num / 100 % 10;
        d3 = num / 10 % 10;
        d4 = num % 10;

        avgEven = 0; 
        avgOdd = 0;
        
        avgOddCount += (d1 % 2 == 0) && (d1 %4 != 0) ? 0 : 1; 
        avgEven += (d1 % 2 == 0) && (d1 %4 != 0) ? d1 : 0; 

        avgOddCount += (d2 % 2 == 0) && (d2 %4 != 0) ? 0 : 1; 
        avgEven += (d2 % 2 == 0) && (d2 %4 != 0) ? d2 : 0; 
        
        avgOddCount += (d3 % 2 == 0) && (d3 %4 != 0) ? 0 : 1; 
        avgEven += (d3 % 2 == 0) && (d3 %4 != 0) ? d3 : 0; 
        
        avgOddCount += (d4 % 2 == 0) && (d4 %4 != 0) ? 0 : 1; 
        avgEven += (d4 % 2 == 0) && (d4 %4 != 0) ? d4 : 0; 

        // avg odd
        avgEvenCount += (d1 % 2 != 0) && (d1 %3 != 0) ? 0 : 1; 
        avgOdd += (d1 % 2 != 0) && (d1 %3 != 0)  ? d1 : 0; 

        avgEvenCount += (d2 % 2 != 0) && (d2 %3 != 0) ? 0 : 1; 
        avgOdd += (d2 % 2 != 0) && (d2 %3 != 0) ? d2 : 0; 
        
        avgEvenCount += (d3 % 2 != 0) && (d3 %3 != 0) ? 0 : 1; 
        avgOdd += (d3 % 2 != 0) && (d3 %3 != 0) ? d3 : 0; 
        
        avgEvenCount += (d4 % 2 != 0) && (d4 %3 != 0) ? 0 : 1; 
        avgOdd += (d4 % 2 != 0) && (d4 %3 != 0) ? d4 : 0; 

        avgEven /= avgEvenCount;
        avgOdd /= avgOddCount;

        diff = avgEven - avgOdd;
        System.out.println("Number is: "+num);
        System.out.println("The difference is: "+diff);
    }
}
