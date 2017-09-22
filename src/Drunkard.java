/**
 * Created by I6113620 on 22-9-2017.
 */
public class Drunkard {
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
            if (getDirection() == Direction.UP) { position.y++; }
            if (getDirection() == Direction.DOWN) { position.y--; }
            if (getDirection() == Direction.LEFT) { position.x--; }
            if (getDirection() == Direction.RIGHT) { position.x++; }
            distance--;
        }

        return position;
    }

    public static double randomWalker(int distance, int number_of_runs) {
        int total_distance = 0;
        for (int runs_remaining = number_of_runs; runs_remaining > 0; runs_remaining--) {
            total_distance += randomWalker(distance);
        }

        return total_distance / number_of_runs;
    }

    private static double computeDistance(int x, int y) { return (Math.sqrt(x * x + y * y)); }
}




