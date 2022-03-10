public class Operator5 {
    public static void main(String[] args) {
        int x = 5;
        int y = x--; /* x--は x = x - 1(後処理)と同じ */

        System.out.println("x=" + x + " y=" + y);

        int z =  --y; /* --yは　y = y - 1(前処理)と同じ */

        System.out.println("y=" + y + " z=" + z);

        int i = 6;

        i -= z; /* i = i - zと同じ */

        System.out.println("i=" + i);
    }
}