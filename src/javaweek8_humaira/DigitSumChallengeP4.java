package javaweek8_humaira;

import java.util.Scanner;

/*
4. Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
Hint: Use n % 10 to extract the least-significant digit.
Use n = n / 10 to discard the least-significant digit.
The method needs to be static
Create a class with the name DigitSumChallenge.
 */
public class DigitSumChallengeP4 {

    public static void main(String[] args) {

        int number, digit, sum = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the  number to get sum of the digits: ");
        number = read.nextInt();
        while(number>0){
            //finds the last digit of the given number
            digit = number % 10;
            // adds last digit to the variable sum
            sum = sum + digit;
            //removes the last digit from the number
            number = number/10;
        }
        //prints the result
        System.out.println("Sum of digits " + sum);

    }
}










