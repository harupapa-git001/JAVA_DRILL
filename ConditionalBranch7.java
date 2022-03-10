import java.util.Scanner;

public class ConditionalBranch7 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("整数を2つ入力してください。");
        System.out.print("1つ目: ");
        int x = stdin.nextInt();
        System.out.print("2つ目: ");
        int y = stdin.nextInt();

        if(x > y) {
            System.out.println("1つ目の数字は2つ目の数字よりも大きいです。");
        }else {
            System.out.println("1つ目の数字は2つ目の数字よりも大きくないです。");
        }
    }
}