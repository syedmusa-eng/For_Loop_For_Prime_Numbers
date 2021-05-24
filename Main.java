public class Main {

    public static void main(String[] args) {

        //Using for loop to find multiple prime numbers in the range.
        //When we find the first 10 prime numbers we have to stop the search.
        int primeCounter = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                primeCounter++;
                System.out.println(i + " is our Prime number & so far " + primeCounter +
                        " prime numbers have been found.");
                if (primeCounter == 10) {
                    break;
                }
            }
        }
    }

    //Creating a method to find the prime numbers.
    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
