package javaweek8_humaira;

import java.util.Scanner;

/*
13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
 */
public class SharedDigitP13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter first number: ");
        int a = scan.nextInt();
        System.out.print ("Enter second number: ");
        int b = scan.nextInt();
        System.out.println("Result: " + hasSharedDigit(a, b));
    }

    public static boolean hasSharedDigit(int first, int second) {
        if ((first >= 10 && first <= 99) && (second >= 10 && second <= 99)) {
            int firstNoLastDigit = first % 10;
            int secondNoLastDigit = second % 10;
            first /= 10;
            second /= 10;
            int firstNoFirstDigit = first;
            int secondNoFirstDigit = second;
            System.out.println("Is there a shared digit in both input numbers?");
            return ((firstNoFirstDigit == secondNoFirstDigit) || (firstNoFirstDigit == secondNoLastDigit) || (firstNoLastDigit == secondNoFirstDigit) || (firstNoLastDigit == secondNoLastDigit));
        }
        return false;
    }
}

