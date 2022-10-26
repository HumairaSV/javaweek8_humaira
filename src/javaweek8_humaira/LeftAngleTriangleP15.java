package javaweek8_humaira;
/*
15. Display left angle triangle of * using nested for loops
 */
public class LeftAngleTriangleP15 {
    public static void main(String[] args) {
        LeftAngleTriangleP15 obj = new LeftAngleTriangleP15();
        obj.printPattern(5);

    }
    private void printPattern(int a)
    {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a; j++) {
                System.out.print(( j >= i ? "* " : "  "));
            }
            System.out.println();
        }
    }
}
