import java.util.Scanner;

public class Function10 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("異なる整数を3つ入力してください。");
        System.out.print("整数a:");
        int a = stdin.nextInt();
        System.out.print("整数b:");
        int b = stdin.nextInt();
        System.out.print("整数c:");
        int c = stdin.nextInt();
        int center = Center(a, b, c);
        System.out.println("比較すると中央値は" + center + "です。");
    }
    public static int Center(int x, int y, int z) {
        if((x < y) && (x > z)) {
            return x;
        }else if((x > y) && (x < z)) {
            return x;
        }else if((y < x) && (y > z)) {
            return y;
        }else if((y > x) && (y < z)) {
            return y;
        }else if((z < x) && (z > y)) {
            return z;
        }else if((z > x) && (z < y)) {
            return z;
        }else {
            return 0;
        }
    }
}