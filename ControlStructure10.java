public class ControlStructure10 {
    public static void main(String[] args) {
        System.out.println("1,2,4,8,16,, と1からの数字を倍にしていきます。");
        System.out.println("数字は15個表示されます。");
        int x = 1;
        for(int i = 0; i <= 14; i++) {
            System.out.println("x=" + x);
            x = x * 2;

        }
    }
}