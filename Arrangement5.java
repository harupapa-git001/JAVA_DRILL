import java.util.Random;

public class Arrangement5 {
    public static void main(String[] args) {
        int[] score = new int[5];
        Random rand = new Random();
        System.out.println("ランダムに点数を入れました。");
        for(int i = 0; i < score.length; i++) {
            score[i] = rand.nextInt(90);
            System.out.println((i + 1) + "人目:" + score[i]);
        }
        score = EvenNumberScoreChange(score);
        System.out.println("偶数人目の点数を変更しました。");
        for(int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "人目:" + score[i]);
        }
    }
    public static int[] EvenNumberScoreChange(int[] array) {
        Random rand = new Random();
        for(int i = 0; i < array.length; i++) {
            if((i + 1) % 2 == 0) {
                array[i] = rand.nextInt(90);
            }
        }
        return array;
    }
}