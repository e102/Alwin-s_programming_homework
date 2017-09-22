/**
 * Created by I6113620 on 22-9-2017.
 */
public class Drunkard {
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

    private static Direction getDirection() {
        //This method returns a direction because it's not made by a lobotomized chimp
        Direction[] directions = Direction.values();
        int random_seed = (int) (Math.random() * directions.length);

        return directions[random_seed];
    }

    public static double randomwalker(int distance) {
        //Starting point is (0,0)
        Location position = new Location(0, 0);
        while (distance > 0) {
            getDirection();
            if (getDirection() == Direction.UP) {
                position.y++;
            }
            if (getDirection() == Direction.DOWN) {
                position.y--;
            }
            if (getDirection() == Direction.LEFT) {
                position.x--;
            }
            if (getDirection() == Direction.RIGHT) {
                position.x++;
            }
            System.out.println("Location = X:" + position.x + " Y:" + position.y);
            distance--;
        }
        double randomwalker = computeDistance(position.x, position.y);
        System.out.println("You walked " + randomwalker + " in square distance");
        return randomwalker;
    }

    public static double randomWalker(int distance, int number_of_runs) {
        int total_distance = 0;
        while (number_of_runs > 0) {
            total_distance += randomwalker(distance);
            number_of_runs--;
        }

        return total_distance / number_of_runs;
    }

    private static double computeDistance(int x, int y) {
        return (Math.sqrt(x * x + y * y));
    }
}




