public class Arrangement2 {
    public static void main(String[] args) {
        int[] score = {75, 60, 89, 45, 91};
        
        int sum = score[0] + score[1] + score[2] + score[3] + score[4];
        double avarage = sum / score.length;
        for(int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "人目:" + score[i]);
        }
        System.out.println("合計点:" + sum);
        System.out.println("平均点:" + avarage);
    }
}