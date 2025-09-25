package org.example;

import java.util.Stack;

public class Main {

    // Palindrome kontrol metodu
    public static boolean checkForPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }
        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Decimal -> Binary çevirme metodu
    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        // Örnek kullanım (opsiyonel)
        System.out.println(checkForPalindrome("I did, did I?"));  // true
        System.out.println(convertDecimalToBinary(13));           // 1101
    }
}
