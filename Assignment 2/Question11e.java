class Question11e {
    public static void main(String[] args) {
        int start = 23, end = 249, primeCount = 0, avgPrime = 0, avgPallendrum = 0,pallendrumCount = 0;
        for (int i = start; i <= end; i++){

            boolean isPrime = true;
            int temp, d, rev = 0;
            
            for(int j = 2; j < i; j++){
                if(i%j == 0) isPrime =false;
            }

            temp = i;
            while(temp > 0){
                d = temp % 10;
                rev = rev * 10 + d;
                temp /= 10;
            }
            if(rev == i){
                avgPallendrum += i;
                pallendrumCount++;
            }
            
            if(isPrime){
                primeCount++;
                avgPrime += i;
            }
        }
        avgPallendrum /= pallendrumCount;
        avgPrime /= primeCount;

        System.out.println("The difference between average of pallendrum and prime numbers is: "+(avgPallendrum - avgPrime));
        
    }
}
