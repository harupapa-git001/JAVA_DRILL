public class Operator9 {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 5;
        

        y = ++y;
        x += z;
        z = x;

        System.out.print("x=" + x);
        System.out.print(" y=" + y);
        System.out.println(" z=" + z);
    }
}