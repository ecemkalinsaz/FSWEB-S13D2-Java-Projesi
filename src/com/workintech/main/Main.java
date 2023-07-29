package com.workintech.main;

public class Main {
    public static void main(String[] args) {

    // 1) Palindrom Sayıyı Bulma
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false

    // 2) Mükemmel Sayıları Bulma
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));  // false

    // 3) Sayıları Kelimelere Dök
        System.out.println(numberToWords(123));   // "One Two Three"
        System.out.println(numberToWords(1010));  // "One Zero One Zero"
        System.out.println(numberToWords(-12));   // "Invalid Value"
    }

    // 1) Palindrom Sayıyı Bulma
    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reverse = 0;

        // Sayının mutlak değerini alarak negatiflik durumunu düzeltiyoruz.
        int absNumber = Math.abs(number);

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverse;
    }

    // 2) Mükemmel Sayıları Bulma
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

    // 3) Sayıları Kelimelere Dök
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String[] words = {
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };

        String numberString = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            result.append(words[digit]).append(" ");
        }

        return result.toString().trim();
    }
}


