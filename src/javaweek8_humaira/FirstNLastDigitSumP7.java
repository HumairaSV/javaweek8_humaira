package javaweek8_humaira;

import java.util.Scanner;

/*
7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class FirstNLastDigitSumP7 {
    static int number,firstDigit,lastDigit,x;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = scan.nextInt();
        System.out.println("Sum of first and last digit is: " + sumFirstAndLastDigit());
    }

    public static int sumFirstAndLastDigit() {
        if(number<0){
            return -1;
        }
        firstDigit = 0;
        lastDigit = number % 10;
        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
            x= firstDigit + lastDigit;
        }
        return x;
    }
}
