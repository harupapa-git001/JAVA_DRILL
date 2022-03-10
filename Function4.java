import java.util.Scanner;
public class Function4 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("整数を入力してください。");
        System.out.print("整数a:");
        int x = stdin.nextInt();
        int sum = Tashizan(x);
        System.out.println("0~" + x + "の合計は" + sum + "です。");
    }
    public static int Tashizan(int a) {
        int num = 0;
        for(int i = 0; i <= a; i++) {
            num = num + i;
        }
        return num;
    }
}