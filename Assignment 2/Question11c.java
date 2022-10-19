class Question11c {
    public static void main(String[] args) {
        int start = 23, end = 249, count = 0;
        for (int i = start; i <= end; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0) isPrime =false;
            }
            if(isPrime) count++;
        }
        System.out.println("There is total "+count+" number of prime number in between "+start+" & "+end);
    }
}
