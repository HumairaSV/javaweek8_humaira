package javaweek8_humaira;

import java.util.Scanner;

/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class EvenDigitSumP11 {
static int number;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = obj.nextInt();
        System.out.println(getEvenDigitSum(number));

    }

    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumOfEvenDigits += lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.print("The sum of even digits of number " + originalNumber + " is: ");
            }
            return sumOfEvenDigits;
        }

        return -1;
    }
    }

