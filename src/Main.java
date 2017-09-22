import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("random walker distance = " + Drunkard.randomWalker(10));
        System.out.println("random walker repeated distance = "  + Drunkard.randomWalker(1000, 10000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a positive integer to get the hailstone sequence, type a negative number to quit.");
        int x = scanner.nextInt();
        while ( x > 0){
            Wondrous.printHailStones(x);
            x = scanner.nextInt();
        }
    }
}
