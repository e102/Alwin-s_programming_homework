/**
 * Created by I6113620 on 22-9-2017.
 */
public class Drunkard {
    public static void main(String[] args) {
        System.out.println("random walker distance = " + randomWalker(10));
        System.out.println("random walker repeated distance = "  + randomWalker(1000, 10000));
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

    public static double randomWalker(int distance) {
        Location position = new Location(0, 0);
        position = randomWalk(distance, position);
        return computeDistance(position.x, position.y);
    }

    private static Location randomWalk(int distance, Location initial_location) {
        Location position = initial_location;
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
            distance--;
        }

        return position;
    }

    public static double randomWalker(int distance, int number_of_runs) {
        int total_distance = 0;
        while (number_of_runs > 0) {
            total_distance += randomWalker(distance);
            number_of_runs--;
        }

        return total_distance / number_of_runs;
    }

    private static double computeDistance(int x, int y) {
        return (Math.sqrt(x * x + y * y));
    }
}




