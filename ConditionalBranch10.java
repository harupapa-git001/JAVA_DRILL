import java.util.Scanner;

public class ConditionalBranch10 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("異なる整数を3つ入力してください。");

        System.out.print("1つ目: ");
        int x = stdin.nextInt();

        System.out.print("2つ目: ");
        int y = stdin.nextInt();

        System.out.print("3つ目: ");
        int z = stdin.nextInt();

        if(x > y && x > z) {
                System.out.println("1つ目の数字が最も大きいです");

        }else if(y > x && y > z) {
                System.out.println("2つ目の数字が最も大きいです");
                
        }else {
                System.out.println("3つ目の数字が最も大きいです");
        }
        
    }
}