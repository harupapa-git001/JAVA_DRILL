public class Comparison4 {
    public static void main(String[] args) {
        boolean result;

        int x = 7;
        int j = 8;

        result = (x <= 5 ) && (j < 10);
        System.out.println("x <= 5 && j < 10の結果: " + result);

        result = (x >= 5) && (j > 5);
        System.out.println("x >= 5 && j > 5の結果: " + result);

        result = (x <= 9) || (j < 3);
        System.out.println("x <= 9 || j < 3の結果: " + result);

        result = (x < 7) || (j <= 3);
        System.out.println("x <= 7 || j <= 3の結果: " + result);

        result = (x != 8) ^ (j < 9);
        System.out.println("x != 8 ^ j < 9の結果: " + result);

        result = (x < 5) ^ (j < 8);
        System.out.println("x < 5 ^ j < 8の結果: "+ result);
    }
}