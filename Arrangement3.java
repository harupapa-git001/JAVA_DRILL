public class Arrangement3 {
    public static void main(String[] args) {
        int[] score = {75, 60, 89, 45, 91};

        int sum = ArraySum(score);
        double avarage = sum / score.length;
        for(int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "人目:" + score[i]);
        }
        System.out.println("合計点:" + sum);
        System.out.println("平均点:" + avarage);
    }
    public static int ArraySum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}