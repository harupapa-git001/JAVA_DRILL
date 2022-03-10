public class Operator10 {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        int z = 2;

        x = y;
        y = ++z;
        z -= z;

        System.out.print("x=" + x);
        System.out.print(" y=" + y);
        System.out.println(" z=" + z);
    }
}