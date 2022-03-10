import java.util.Random;
import java.util.Scanner;

public class Arrangement11 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdin = new Scanner(System.in);
        
        String[] EnglishWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        int num = QuestionWordNum(EnglishWeek);
        String question = EnglishWeek[num];
        System.out.println("月曜日, 火曜日と日本語でお答えください。");
        while(true) {
            System.out.println(question + "は何曜日でしょうか?");
            
            System.out.print("解答:");
            String answer = stdin.next();
        
            if(AnswerCheack(answer, num) == true) {
                System.out.println("正解です。");
                break;
            }else {
                System.out.println("不正解です。");
            }
        }
    }
    public static int QuestionWordNum(String[] array) {
        Random rand = new Random();
        return rand.nextInt(array.length);
    }
    public static boolean AnswerCheack(String answer, int number) {
        String[] JapaneseWeek = {"月曜日", "火曜日", "水曜日", "木曜日","金曜日", "土曜日", "日曜日"};
        
        String[] JapaneseWeek2 = {"月曜日", "火曜日", "水曜日", "木曜日","金曜日", "土曜日", "日曜日"};

        if(answer.equals(JapaneseWeek[number]) == true) {
            return true;
        }else if(answer.equals(JapaneseWeek2[number]) == true) {
            return true;
        }else {
            return false;
        }
    }
}