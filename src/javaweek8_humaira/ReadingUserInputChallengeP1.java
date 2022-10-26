package javaweek8_humaira;

import java.util.Scanner;

/*
1. Read 10 numbers from the console entered by the user and print the sum of those
numbers.
 */
public class ReadingUserInputChallengeP1 {
    public static void main(String[] args) {
        ReadingUserInputChallengeP1 obj = new ReadingUserInputChallengeP1();
        obj.myMethod();
    }

    public void myMethod() {
        int counter = 0;
        int[] x = new int[10];


        while (counter < 10) {
            Scanner input = new Scanner(System.in); //construct scanner
            System.out.print("Enter the number " + (counter + 1 ) + ": ");
            if (input.hasNextInt()) {
                x[counter] = input.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }

        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + x[i];
        }
        System.out.println("Sum of the numbers is:  " + sum );

    }
}
