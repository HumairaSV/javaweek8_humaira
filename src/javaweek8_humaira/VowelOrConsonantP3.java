package javaweek8_humaira;

import java.util.Objects;
import java.util.Scanner;

/*
3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
public class VowelOrConsonantP3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a single character from the Alphabet: ");
        String x = read.next();
        if (x.length() == 1 && Character.isAlphabetic((x.charAt(0)))) {
            char ch = Character.toLowerCase((x.charAt(0)));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(x + " is a vowel");
            } else {
                System.out.println(x + " is a Consonant");
            }
        }else{
            System.out.println("Invalid Input");
        }
    }
    }

