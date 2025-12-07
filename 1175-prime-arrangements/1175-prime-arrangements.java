class Solution {
    public int numPrimeArrangements(int n) {
        if(n < 2){
            return 1;
        }
        long res = 1;
        int prime = 1;
        int notPrime = 1;
        for(int i = 3; i <= n; i++){
            if(isPrime(i)){
                prime++;
            }else{
                notPrime++;
            }
        }
        for(int i = prime; i > 0; i--){
            res *= i;
            res %= 1000000007;
        }
        for(int i = notPrime; i > 0; i--){
            res *=i;
            res %= 1000000007;
        }
        return (int)res; 
    }
    public boolean isPrime(int num){
        for(int i =  2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}