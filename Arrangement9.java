import java.util.Random;

public class Arrangement9 {
    public static void main(String[] args) {
        int[] score = new int[5];
        Random rand = new Random();
        System.out.println("ランダムに点数を入れました。");
        for(int i = 0; i < score.length; i++) {
            score[i] = rand.nextInt(90);
            System.out.println((i + 1) + "人目:" + score[i]);
        }
        System.out.println("記列を逆順にしました。");
        ScoreReversal(score);

        System.out.println("(実行するたびに変わります。)");

    }
    public static int[] ScoreReversal(int[] array) {
        int sort = array[0];
        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                sort = array[4];
                System.out.println((i + 1) + "人目:" + array[4]);
            }else if(i == 1) {
                sort = array[3];
                System.out.println((i + 1) + "人目:" + array[3]);
            }else if(i == 2) {
                sort = array[2];
                System.out.println((i + 1) + "人目:" + array[2]);
            }else if(i == 3) {
                sort = array[1];
                System.out.println((i + 1) + "人目:" + array[1]);
            }else if(i == 4) {
                sort = array[0];
                System.out.println((i + 1) + "人目:" + array[0]);
            }else {
                System.out.println("エラーです。");
            }
        }
        return array;
    }
}