import java.util.Scanner;

import javax.print.event.PrintEvent;

public class ConditionalBranch8 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("1~10の中の素数を1つ入力してください。");
        System.out.print("入力数字: ");

        int n = stdin.nextInt();

        switch(n) {
            case 2: System.out.println("2は素数ですね");
                break;
            case 3: System.out.println("3は素数ですね");
                break;
            case 5: System.out.println("5は素数ですね");
                break;
            case 7: System.out.println("7は素数ですね");
                break;
            default: System.out.println("入力した数字は素数ではありません");
                break;
        }
    }
}