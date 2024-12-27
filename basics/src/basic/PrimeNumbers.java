package basic;

public class PrimeNumbers {
    public static void main(String[] args) {
        int prime = 0, max = 100;

        System.out.println("Determine the prime numbers in a range from 1 to " + max);

        for (int n = 5; n <= max; n+=2) {
            for (int p = 1; p <= n; p+=2) {
                if (n % p == 0) prime++;
            }
            if (n == 5) System.out.println("2 is a prime number");
            if (prime == 2 ) System.out.println(n + " is a prime number");
            prime = 0;
        }
    }
}