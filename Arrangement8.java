import java.util.Random;

public class Arrangement8 {
    public static void main(String[] args) {
        int[] score = new int[5];
        Random rand = new Random();
        System.out.println("ランダムに点数を入れました。");
        for(int i = 0; i < score.length; i++) {
            score[i] = rand.nextInt(90);
            System.out.println((i + 1) + "人目:" + score[i]);
            
        }
        System.out.println("奇数点の人数は" + OddScoreCount(score));
        System.out.println("(実行するたびに変わります。)");
    }
    public static int OddScoreCount(int[] array) {
        int num = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1) {
                num += 1;
            }
        }
        return num;
    }
}