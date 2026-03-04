class Solution {
    public int countPrimes(int n) {

        // If n <= 2, there are no primes less than n
        if (n <= 2) {
            return 0;
        }

        // Boolean array where isPrime[i] tells whether i is prime
        // Initially assume all numbers are prime
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        isPrime[0] = false;
        isPrime[1] = false;

        // List to store discovered prime numbers
        List<Integer> primes = new ArrayList<>();

        // Iterate through all numbers from 2 to n-1
        for (int i = 2; i < n; i++) {

            // If still marked prime, it is a prime number
            if (isPrime[i]) {
                primes.add(i);
            }

            for (int p : primes) {

                // Stop if product goes out of range
                if ((long) i * p >= n) {
                    break;
                }

                // Mark composite number
                isPrime[i * p] = false;
            }
        }

        return primes.size();
    }
}
