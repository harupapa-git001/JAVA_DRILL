import java.util.Scanner;

public class Function11 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("異なる整数を3つ入力してください。");
        System.out.print("整数a:");
        int a = stdin.nextInt();
        System.out.print("整数b:");
        int b = stdin.nextInt();
        System.out.print("整数c:");
        int c = stdin.nextInt();
        int gosa = PointDifference(a, b, c);
        System.out.println("一番大きい数字と一番小さい数字の差は" + gosa + "です。");
    }
    public static int PointDifference(int x, int y, int z) {
        if((x > y) && (x > z)) {
            if((y < x) && (y < z)) {
                return x - y;
            }else {
                return x - z;
            }
        }else if((y > x) && (y > z)) {
            if((x < y) && (x < z)) {
                return y - x;
            }else {
                return y - z;
            }
        }else {
            if((x < y) && (x < z)) {
                return z - x;
            }else {
                return z - y;
            }
        }
    }
}