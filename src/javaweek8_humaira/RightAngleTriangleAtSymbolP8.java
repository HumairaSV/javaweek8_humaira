package javaweek8_humaira;
/*
8. Display right angle triangle of @ using nested for loops
 */
public class RightAngleTriangleAtSymbolP8 {

    public static void main(String[] args) {
        RightAngleTriangleAtSymbolP8 obj = new RightAngleTriangleAtSymbolP8();
        obj.printPattern(5);
    }

    private void printPattern(int a)
    {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
