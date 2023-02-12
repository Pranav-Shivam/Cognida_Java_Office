package tester.anonymousFunction;

import java.util.function.Predicate;

@FunctionalInterface
interface primeChecker{
     boolean isPrime(int n);
}
public class CheckPrime {
    public static void main(String[] args) {
         primeChecker isPrime = (int x) -> {
             int ct = 0;
             if (x == 1) {
                 return false;
             }
             for (int i = 2; i <= x; i++) {
                 if (x % i == 0) {
                     ct++;
                 }
                 if (ct > 1) {
                     return false;
                 }
             }
             return true;
        };
        System.out.println(isPrime.isPrime(7));

    }
    public static void checkPrime() {
        int number = 17;
        Predicate<Integer> isPrime = (n) -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        if (isPrime.test(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}

