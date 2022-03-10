public class Operator7 {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;
        int z = 3;

        x = (x + y) - z;
        y = y - x;
        z = x;

        System.out.print("x=" + x);
        System.out.print(" y=" + y);
        System.out.println(" z=" + z);
    }
}