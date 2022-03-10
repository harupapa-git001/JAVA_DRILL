import java.util.Scanner;
import java.util.Random;

public class ControlStructure11 {
    public static void main(String[] args) {
        String[] hands = {"パー", "チョキ", "グー"};
        Random random = new Random();
        int randomValue = random.nextInt(2);
        //System.out.println(randomValue);

        System.out.println("コンピュータと「じゃんけん」します。");
        System.out.println("パーは「0」, チョキは「1」, グーは「2」");

        int flag = randomValue;

        Scanner scanner = new Scanner(System.in);
        while(randomValue == flag) {
            int myhand = scanner.nextInt();
            System.out.println("何をだす? :" + myhand);
            if((randomValue == 0) && (myhand == 1)) {
                System.out.println("コンピュータは「パー」です。");
                System.out.println("あなたの勝ちです。");
                flag = 3;
            }else if((randomValue == 1) && (myhand == 2)) {
                System.out.println("コンピュータは「チョキ」です。");
                System.out.println("あなたの勝ちです。");
                flag = 3;
            }else if((randomValue == 2) && (myhand == 0)) {
                System.out.println("コンピュータは「グー」です。");
                System.out.println("あなたの勝ちです。");
                flag = 3;
            }else if((randomValue == 2) && (myhand == 1)) {
                System.out.println("コンピュータは「グー」です。");
                System.out.println("あなたの負けです。");
                flag = 3;
            }else if((randomValue == 1) && (myhand == 0)) {
                System.out.println("コンピュータは「チョキ」です。");
                System.out.println("あなたの負けです。");
                flag = 3;
            }else if((randomValue == 0) && (myhand == 2)) {
                System.out.println("コンピュータは「パー」です。");
                System.out.println("あなたの負けです。");
                flag = 3;
            }else if((randomValue == 0) && (myhand == 0)) {
                System.out.println("あいこです。もう一度じゃんけんしてください。");
            }else if((randomValue == 1) && (myhand == 1)) {
                System.out.println("あいこです。もう一度じゃんけんしてください。");
            }else if((randomValue == 2) && (myhand == 2)) {
                System.out.println("あいこです。もう一度じゃんけんしてください。");
            }else {
                System.out.println("エラーです。");
            }
        }
    }
}