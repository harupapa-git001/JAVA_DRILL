import java.util.Random;
import java.util.Scanner;

public class Arrangement6 {
    public static void main(String[] args) {
        String[] EnglishMonth
            = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
        
        int num = QuestionWordNum(EnglishMonth);
        String question = EnglishMonth[num];
        System.out.println("1月, 2月と数字+月で答えてください。");
        System.out.println(question + "は何月でしょうか?");
        Scanner stdin = new Scanner(System.in);
        System.out.print("解答:");
        String answer = stdin.next();
        if(AnswerCheack(answer, num) == true) {
            System.out.println("正解です。");
        }else {
            System.out.println("不正解です。");
        }

    }
    public static int QuestionWordNum(String[] array) {
        Random rand = new Random();
        return rand.nextInt(array.length);
    }
    public static boolean AnswerCheack(String answer, int number) {
        String[] JapaneseMonth
            = {"1月", "2月", "3月", "4月", "5月", "6月",
                "7月", "8月", "9月", "10月", "11月","12月"};
        
        String[] JapaneseMonth2
            = {"1月", "2月", "3月","4月", "5月", "6月",
                "7月", "8月", "9月", "10月", "11月", "12月"};

        if(answer.equals(JapaneseMonth[number]) == true) {
            return true;
        }else if(answer.equals(JapaneseMonth2[number]) == true) {
            return true;
        }else {
            return false;
        }
    }
}