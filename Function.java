public class Function {
    public static void main(String[] args) {
        Max();
    }
    public static void Max() {
        int x = 5;
        int y = 10;
        int max;
        if(x > y) {
            max = x;
        }else {
            max = y;
        }
        System.out.println("整数:" + x);
        System.out.println("整数:" + y);
        System.out.println("比較すると最大値は " + max + "です。");
    }
}