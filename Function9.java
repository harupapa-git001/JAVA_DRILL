import java.util.Scanner;

public class Function9 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("整数を入力してください。");
        System.out.print("整数a:");
        int a = stdin.nextInt();
        int cal = Cal(a);
        System.out.println(a + "の数値の階乗は" + cal + "です。");
    }
    public static int Cal(int x) {
        if(x == 1){
            return x;
        }else {
            return x * Cal(x - 1);
        }
        
    }
}