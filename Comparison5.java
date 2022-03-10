public class Comparison5 {
    public static void main(String[] args) {
        boolean result;
        int i = 9;
        int y = 11;
        int x = i++;
        int j = --y;

        result = (x == 9) || (j <= 10);
        System.out.println("x == 9 && j <= 10の結果: " + result);

        result = (x == 4) && (j <= 9);
        System.out.println("x == 4 && j <= 9の結果: " + result);

        result = (x >= 7) && (j >= 11);
        System.out.println("x >= 7 || j >= 11の結果: " + result);

        result = (x == 9) ^ (j == 11);
        System.out.println("x == 9 ^ j >= 11の結果: " + result);

        result = (x < 12) || (j >= 10);
        System.out.println("x == 9 ^ j >= 10の結果: " + result);

        result = (x != 10) ^ (j <= 8);
        System.out.println("x < 12 ^ j <= 8の結果: " + result);
    }
}