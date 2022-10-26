package javaweek8_humaira;
/*
2. Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
 */
import java.util.Scanner;

public class MinAndMaxInputChallengeP2 {

    public static void main(String[] args) {

        smallestLargest();
    }

    public static void smallestLargest() {
        int index = 0;
        int min = 0;
        int max = 0;

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            if(input.hasNextInt()){
                int number = input.nextInt();
                if(index==0){
                    min = number;
                    max = number;
                }else{
                    if(number<min){
                        min = number;
                    }else if(number>max){
                        max = number;
                    }
                }
                index++;
            }else {
                break;
            }
        }
        System.out.println("Minimum or smaller number is: " + min);
        System.out.println("Maximum or larger number is:  " + max);
    }

}