import java.util.Scanner;

public class Function7 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("整数を5つ入力してください。");
        System.out.print("整数a:");
        int a = stdin.nextInt();
        System.out.print("整数b:");
        int b = stdin.nextInt();
        System.out.print("整数c:");
        int c = stdin.nextInt();
        System.out.print("整数d:");
        int d = stdin.nextInt();
        System.out.print("整数e:");
        int e = stdin.nextInt();

        int sum = SUM(a, b, c, d, e);
        double ave = AVERAGE(a, b, c, d, e);
        System.out.println("合計点:" + sum);
        System.out.println("平均点:" + ave);
    }
    public static int SUM(int v, int w, int x, int y, int z) {
        return v + w + x + y + z;
    }
    public static int AVERAGE(int v, int w, int x, int y, int z){
        return (v + w + x + y + z) / 5;
    }
}