/**
 * Created by I6113620 on 22-9-2017.
 */

public class Wondrous {
    public static void printHailStones(int input) {
        int hailStoneSum = 0;
        int originalNumber = input;
        while (input != 1) {
            if (input % 2 == 0) {
                input = input / 2;
                hailStoneSum++;
                System.out.print(input + " ");
            } else {
                input = (input * 3) + 1;
                System.out.print(input + " ");
                hailStoneSum++;
            }
        }
        System.out.println("The hailstone sequence of " + originalNumber + " requires " + hailStoneSum + " steps ");
    }
}


