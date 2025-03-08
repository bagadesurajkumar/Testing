package org.example;
import java.util.Scanner;  // Import the Scanner class

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out. println("Enter an integer: ");
        int num=sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(num + " is " + (isPrime ? "a prime number." : "not a prime number."));
    }
}
