public class Function2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        Max2(x, y);
        Max2(9, 8);
    }
    public static void Max2(int a, int b) {
        int max;
        if(a >= b) {
            max = a;
        }else {
            max = b;
        }
        System.out.println("整数:" + a);
        System.out.println("整数:" + b);
        System.out.println("比較すると最大値は　" + max + "です。");
    }
}