import java.util.Random;

public class Arrangement10_2 {
    public static void main(String[] args) {
        int[] score = new int[5];
        Random rand = new Random();
        System.out.println("ランダムに点数を入れました。");
        for(int i = 0; i < score.length; i++) {
            score[i] = rand.nextInt(90);
            System.out.println((i + 1) + "人目:" + score[i]);
        }
        System.out.println("全て偶数点に変更しました。");
        AllEvenScore(score);
        for(int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "人目:" + score[i]);

        }
        System.out.println("(実行するたびに変わります。)");
        
    }
    public static int[] AllEvenScore(int[] array) {
        Random rand1 = new Random();
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1) {
                array[i] = rand1.nextInt(45) * 2;
            }
        }
        return array;
    }
}