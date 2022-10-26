package javaweek8_humaira;

import java.util.Scanner;

/*
12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */
public class PrimeNoOrNotP12 {

    public static void main(String[] args) {
        int i,number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a prime number or not: ");
        number = scan.nextInt();
        if(isPrime(number)){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }
        }

        public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2; i< Math.sqrt(number); i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
