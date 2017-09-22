/**
 * Created by I6113620 on 22-9-2017.
 */

public class Wondrous {
    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void printHailStones(int n) {
        int hailStoneSum = 0;
        int originalNumber = n;
        while (n != 1) {
            if (isEven(n)) {
                n = n / 2;
                hailStoneSum++;
                System.out.print(n + " ");
            } else {
                n = (n * 3) + 1;
                System.out.print(n + " ");
                hailStoneSum++;
            }
        }
        System.out.println("The hailstone sequence of " + originalNumber + " requires " + hailStoneSum + " steps ");
    }
}


