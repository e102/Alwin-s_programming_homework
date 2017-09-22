public class Main {
    public static void main(String[] args) {
        System.out.println("random walker distance = " + Drunkard.randomWalker(10));
        System.out.println("random walker repeated distance = "  + Drunkard.randomWalker(1000, 10000));
    }
}
