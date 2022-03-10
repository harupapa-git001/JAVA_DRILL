import java.util.Scanner;

public class Function5 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("整数を入力してください。");
        System.out.print("整数a:");
        int x = stdin.nextInt();
        int sum = Tashizan2(x);
        System.out.println("0~" + x + "の数値の合計は" + sum + "です。");
    }
    public static int Tashizan2(int a) {
        if(a == 0) { /* 停止条件 */
            return 0;
        }else { /* 再帰条件 */
            return a + Tashizan2(a - 1);
        }
    }
}