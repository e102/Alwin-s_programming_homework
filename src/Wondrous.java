/**
 * Created by I6113620 on 22-9-2017.
 */

public class Wondrous {
    public static boolean isEven(int x) {
        return (x % 2 == 0);
    }

    public static void printHailStones(int n) {
        int hailstoneSum = 0;
        int orginialNumber = n;
        while (n != 1) {
            if (isEven(n)) {
                n = n / 2;
                hailstoneSum = hailstoneSum + 1;
                System.out.print(n + " ");
            } else {
                n = (n * 3) + 1;
                System.out.print(n + " ");
                hailstoneSum = hailstoneSum + 1;
            }
        }
        System.out.println("The hailstone sequence of " + orginialNumber + " requires " + hailstoneSum + " steps ");
    }
}


