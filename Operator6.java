public class Operator6 {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;
        int z = 3;

        x = y;
        y = y + z;
        z = y - x;

        System.out.print("x=" + x);
        System.out.print(" y=" + y);
        System.out.println(" z=" + z);
    }
}