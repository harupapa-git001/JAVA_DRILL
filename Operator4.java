public class Operator4 {
    public static void main(String[] args) {
        int i = 1;
        int x = 3;

        int y = x++;
        int z = ++i;

        System.out.println("i=" + i + " x=" + x);
        System.out.println("y=" + y + " z=" + z);
    }
}