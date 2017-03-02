package he2;

	

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tp {


    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        		
        boolean primes[] = generatePrimes(1_000_000);
        List<Integer> primeIntegers = new ArrayList<Integer>();
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                primeIntegers.add(i);
            }
        }
        int count = 0;
        int sum = 0;
        int finalSum = 0;
        int finalCount = 0;
        int totalPrimes = primeIntegers.size();
        for (int start = 0; start < totalPrimes; start++) {
            sum = 0;
            count = 0;
            for (int current = start; current < totalPrimes; current++) {
                int actual = primeIntegers.get(current);
                sum += actual;
                if ( sum >= N ) {
                    break;
                }
                if ( primes[sum] ) {
                    if ( count > finalCount ) {
                        finalCount = count;
                        finalSum = sum;
                    }
                }
                count++;
            }
        }
        System.out.println(finalSum);
    }

    private static boolean[] generatePrimes(int n) {
        boolean primes[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            primes[i] = true;
        }
        primes[0] = false;
        primes[1] = false;
        // i = step
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

}
