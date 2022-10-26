package javaweek8_humaira;

import java.util.Scanner;

/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciNumberP9 {
   static int counter;
    public static void main(String[] args) {
        FibonacciNumberP9 obj = new FibonacciNumberP9();
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter how many fibonacci numbers you want to print: ");
        counter= scan.nextInt();
        fib();

    }

    public static void fib() {
        int n1 = 0, n2 = 1, n3, i, count = counter;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
