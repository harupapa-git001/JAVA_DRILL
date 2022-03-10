public class Function3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int max = Max3(x, y);
        System.out.println("整数:" + x);
        System.out.println("整数:" + y);
        System.out.println("比較すると最大値は " + max + "です。");
    }
    public static int Max3(int a, int b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
}