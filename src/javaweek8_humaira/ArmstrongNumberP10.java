package javaweek8_humaira;

import java.util.Scanner;

/*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
public class ArmstrongNumberP10 {


    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number or not: ");
        num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }


    public static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        //assigning sum in to a temp variable
        temp = n;
        //executing while loop till condition becomes false
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            //determines the last digit from the number
            last = temp % 10;
            //calculates the power of a number upto digit times and add the resultant to the sum variable
            sum += (Math.pow(last, digits));
            //removes the last digit
            temp = temp / 10;

        }
        //compares the sum with n
        if (n == sum)
            //retunrs if sum and n are equal
            return true;
        else return false;

    }
}
