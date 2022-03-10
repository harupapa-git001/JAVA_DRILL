import java.util.Scanner;

public class ConditionalBranch11 {
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
            System.out.println("1つ目の数字:" + x + "が1番目に大きいです。");
            if(y > z) {
                System.out.println("2つ目の数字:" + y + "が2番目に大きいです。");
                System.out.println("3つ目の数字:" + z + "が3番目に大きいです。");
                
            }else {
                System.out.println("3つ目の数字:" + z + "が2番目に大きいです。");
                System.out.println("2つ目の数字:" + y + "が3番目に大きいです。");
            }

        }else if(y > x && y > z) {
            System.out.println("2つ目の数字:" + y + "が1番目に大きいです。");
            if(x > z) {
                System.out.println("1つ目の数字:" + x + "が2番目に大きいです。");
                System.out.println("3つ目の数字:" + z + "が3番目に大きいです。");
                
            }else {
                System.out.println("3つ目の数字:" + z + "が2番目に大きいです。");
                System.out.println("1つ目の数字:" + x + "が3番目に大きいです。");
            }

        }else if(z > x && z > y) {
            System.out.println("3つ目の数字:" + z + "が1番目に大きいです。");
            if(x > y) {
                System.out.println("1つ目の数字:" + x + "が2番目に大きいです。");
                System.out.println("2つ目の数字:" + y + "が3番目に大きいです。");
                
            }else {
                System.out.println("2つ目の数字:" + y + "が2番目に大きいです。");
                System.out.println("1つ目の数字:" + x + "が3番目に大きいです。");
            }

        }else {
            System.out.println("該当がありません。");
        }
    }
}