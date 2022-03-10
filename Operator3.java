public class Operator3 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = 4;

        x += z; /* x = x + zと同じ */
        y++;    /* y = y + 1(後処理)と同じ */
        ++z;    /* z = z + 1(先処理)と同じ */

        System.out.print("x=" + x);
        System.out.print(" y=" + y);
        System.out.println(" z=" + z);
    }
}