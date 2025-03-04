package Problem.Seven;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (isPrime(n)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2 || n > 100) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
