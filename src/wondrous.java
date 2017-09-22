/**
 * Created by I6113620 on 22-9-2017.
 */
import java.util.*;
public class wondrous {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a positive integer to get the hailstone sequence, type a negative number to quit.");
        int x = scanner.nextInt();
        while ( x > 0){
            printHailStones(x);
            x = scanner.nextInt();
        }
    }

    public static boolean isEven (int x) {
        boolean isEven = (x % 2 ==0);
        //System.out.println(isEven);
   return isEven;
    }

    public static void printHailStones (int n) {
        int hailstoneSum = 0;
        int orginialNumber = n;
        while (n != 1) {
            if (isEven(n)){
                n = n / 2;
                hailstoneSum = hailstoneSum + 1;
                System.out.print(n + " ");
            }
            else{
                n = (n * 3) + 1;
                System.out.print(n + " ");
                hailstoneSum = hailstoneSum + 1;
            }
        }
        System.out.println("The hailstone sequence of " + orginialNumber + " requires "+ hailstoneSum + " steps " );
    }
}


