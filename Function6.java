import java.util.Scanner;

public class Function6 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("異なる整数を2つ入力してください。");
        System.out.print("整数a:");
        int x = stdin.nextInt();
        System.out.print("整数b:");
        int y = stdin.nextInt();
        int min = min(x, y);
        System.out.println("比較すると最小値は" + min + "です。");
    }
    public static int min(int a, int b) {
        if(a < b) {
            return a;
        }else {
            return b;
        }
    }
}