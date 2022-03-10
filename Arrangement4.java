import java.util.Random;

public class Arrangement4 {
    public static void main(String[] args) {
        int[] score = new int[5];

        Random rand = new Random();
        System.out.println("ランダムに点数を入れました。");
        for(int i = 0; i < score.length; i++) {
            score[i] = rand.nextInt(90); /* 0~90の数字をランダムに追加 */
            System.out.println((i + 1) + "人目:" + score[i]);
        }
        System.out.println("実行するたびに変わります。");
    }
}