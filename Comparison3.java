public class Comparison3 {
    public static void main(String[] args) {
        boolean result;

        int x = 5;
        int j = 3;

        result = (x <= 5) && (j < 3);
        System.out.println("x <= 5 && j < 3の結果: " + result);

        result = (x <= 5) && (j <= 3);
        System.out.println("x <= 5 && j <= 3の結果: " + result);

        result = (x <= 5) || (j < 3);
        System.out.println("x <= 5 || j < 3の結果: " + result);

        result = (x < 5) || (j < 3);
        System.out.println("x < 5 || j < 3の結果: " + result);

        result = (x == 5) ^ (j < 3);
        System.out.println("x == 5 ^ j < 3の結果: " + result);

        result = (x != 5) ^ (j != 3);
        System.out.println("x != 5 ^ j != 3の結果: " + result);
    }
}