import java.util.Scanner;

public class Function8 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("異なる整数を3つ入力してください。");
        System.out.print("整数a:");
        int a = stdin.nextInt();
        System.out.print("整数b:");
        int b = stdin.nextInt();
        System.out.print("整数c:");
        int c = stdin.nextInt();
        int min = min(a, b, c);
        System.out.println("比較すると最小値は" + min + "です。");
    }
    public static int min(int x, int y, int z) {
        if((x < y) && (x < z)) {
            return x;
        }else if((y < x) && (y < z)) {
            return y;
        }else if((z <x) && (z < y)) {
            return z;
        }else {
            return 0;
        }
    }
}