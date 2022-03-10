import java.util.Scanner;

public class ConditionalBranch6 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("あなたの年齢を入力してください。");
        System.out.print("年齢:");
        int x = stdin.nextInt();

        if(x >= 20) {
            System.out.println("あなたは成人していますね。");
        }else {
            System.out.println("あなたは成人していませんね。");
        }
    }
}