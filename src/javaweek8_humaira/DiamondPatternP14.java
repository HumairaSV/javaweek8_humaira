package javaweek8_humaira;
/*
14. Write a program in Java to display the pattern like a diamond.
While loop

 */
public class DiamondPatternP14 {
    public static void main(String[] args) {
        diamondPattern(5);
    }
    public static void diamondPattern(int x){
        int n = 0;
        while (n <= 2*x)
        {
            int i = Math.abs(x - n);
            if (i == 0) {
                n+=2;
                continue;
            }
            for (int j = 1; j <= 2*x - i; j++) {
                if (j >= i) {
                    System.out.print("* ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
            n++;
        }
    }

}
