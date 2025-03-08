package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
   //     String str = "Automation";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input: ");
        String str1 = sc.nextLine();
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}
