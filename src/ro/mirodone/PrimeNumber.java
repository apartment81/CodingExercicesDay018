package ro.mirodone;

public class PrimeNumber {

    public Boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
