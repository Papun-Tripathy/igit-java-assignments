class Question8 {
    public static void main(String[] args) {
        int start = 23, end = 249, pallendrumCount = 0, primeCount = 0;
        double avgPallendrum = 0, avgPrime = 0;

        for(int i = start; i <= end; i++){
            boolean isPrime = true, isPallendrum = false;
            int temp = i, rev = 0;
            for(int j = 2; j < i; j++)
                if(i%j == 0) isPrime = false;
            
            while(temp > 0){
                int d = temp% 10;
                rev = rev * 10 + d;
                temp /= 10;
            }
            if(rev == i) isPallendrum = true;
            if(isPrime){
                avgPrime += i;
                primeCount++;
            }
            if(isPallendrum){
                avgPallendrum += i;
                pallendrumCount++;
            }
        }
        avgPrime = avgPrime / primeCount;
        avgPallendrum = avgPallendrum / pallendrumCount;
        System.out.println("difference between average of palindrome and prime numbers is:"+(avgPallendrum - avgPrime));
    }
}
