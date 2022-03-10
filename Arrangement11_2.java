import java.util.Random;
import java.util.Scanner;

public class Arrangement11_2 {
    public static void main(String[] args) {
        String[] EnglishWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" ,"Friday", "Saturday"};
        String[] JapaneseWeek = {"日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"};

        Random rand = new Random();
        Scanner stdin = new Scanner(System.in);

        int question = rand.nextInt(7);

        System.out.println("月曜日, 火曜日と日本語で解答してください。");

        while(true) {
            System.out.println(EnglishWeek[question] + "は何曜日でしょうか？");
            System.out.print("解答:");
            String answer = stdin.next();

            if(answer.contentEquals(JapaneseWeek[question])) {
                System.out.println("正解です。");
                break;
            }else {
                System.out.print("不正解です。");
                System.out.println("もう一度回答してください。");
                continue;
            }
        }
        System.out.println("(実行するたびに変わります。)");
    }
}