public class Arrangement {
    public static void main(String[] args) {
        int[] score = new int[5];
        score[0] = 75;
        score[1] = 60;
        score[2] = 89;
        score[3] = 45;
        score[4] = 91;

        int sum = score[0] + score[1] + score[2] + score[3] + score[4];
        double avarage = sum / 5;

        System.out.println("1人目:" + score[0]);
        System.out.println("2人目:" + score[1]);
        System.out.println("3人目:" + score[2]);
        System.out.println("4人目:" + score[3]);
        System.out.println("5人目:" + score[4]);
        System.out.println("合計点:" + sum);
        System.out.println("平均点:" + avarage);
    }
}