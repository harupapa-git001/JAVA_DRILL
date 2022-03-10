import java.util.Scanner;

public class ConditionalBranch5 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in); /* キーボード操作を許可 */
        System.out.println("1~5の数字を入力してください。");
        int n = stdin.nextInt(); /* キーボードから入力した数字をnへ入れる */

        switch(n) {
            case 3: System.out.println("3を入力したあなたは、　小吉です。");
                break;
            case 4: System.out.println("4を入力したあなたは、 大吉です。");
                break;
            case 5: System.out.println("5を入力したあなたは、　中吉です。");
                break;
            default: System.out.println("3~5以外の数字を入力したあなたは、　吉です。");
                break;
        }
    }
}