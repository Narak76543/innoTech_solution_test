public class PrimeChecker {

    public static boolean isPrime(int n) {
        // 1. Handle edge cases
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num1 = 17; // Prime
        int num2 = 15; // Not Prime (Divisible by 3 and 5)
        int num3 = 1;  // Not Prime (Edge case)
        int num4 = 29; // Prime

        System.out.println(num1 + " is prime: " + isPrime(num1)); 
        System.out.println(num2 + " is prime: " + isPrime(num2)); 
        System.out.println(num3 + " is prime: " + isPrime(num3)); 
        System.out.println(num4 + " is prime: " + isPrime(num4)); 
    }
}