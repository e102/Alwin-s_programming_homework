/**
 * Created by I6113620 on 22-9-2017.
 */
public class drunkard {
    public static void main(String[] args) {
        randomwalker(10);
        randomWalker(10, 10000);
    }

    private enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static Direction getDirection() {
        //This method returns a direction because it's not made by a lobotomized chimp
        Direction[] directions = Direction.values();
        int random_seed = (int) (Math.random() * directions.length);

        return directions[random_seed];
    }

    public static double randomwalker(int distance) {
        //Starting point is (0,0)
        int x = 0, y = 0;
        while (distance > 0) {
            getDirection();
            if (getDirection() == Direction.UP) {
                y++;
            }
            if (getDirection() == Direction.DOWN) {
                y--;
            }
            if (getDirection() == Direction.LEFT) {
                x--;
            }
            if (getDirection() == Direction.RIGHT) {
                x++;
            }
            printLocation(x, y);
            distance--;
        }
        double randomwalker = computeDistance(x, y);
        System.out.println("You walked " + randomwalker + " in square distance");
        return randomwalker;
    }

    public static void randomWalker(int N, int T) {
        double totalDistance = 0;
        double totalMean = 0;
        double iteration = 0;
        int NN = N;
        int TT = T;
        while (T > 0) {
            int x = 0, y = 0;
            N = NN;
            while (N > 0) {
                getDirection();
                if (getDirection() == Direction.UP) {
                    y++;
                }
                if (getDirection() == Direction.DOWN) {
                    y--;
                }
                if (getDirection() == Direction.LEFT) {
                    x--;
                }
                if (getDirection() == Direction.RIGHT) {
                    x++;
                }
                N--;
            }
            iteration = computeDistance(x, y);
            totalDistance = totalDistance + iteration;
            T--;
            if (T == 1) {
                totalMean = totalDistance / TT;
                System.out.println("The mean distance is " + totalMean);

            }
        }
    }


    public static void printLocation(int x, int y) {
        System.out.println(x + "," + y);
    }

    public static double computeDistance(int x, int y) {
        int squarex = x * x;
        int squarey = y * y;
        double computeDistance = (squarex + squarey);
        return computeDistance;
        //This method is double and should return the distance from (0,0), given (x,y)
    }
}




