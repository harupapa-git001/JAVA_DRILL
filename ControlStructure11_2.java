import java.util.Scanner;
import java.util.Random;

public class ControlStructure11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rad = new Random();
        boolean cont = true;
        while(cont) {
            int cpu = rad.nextInt(3);
            System.out.println("何をだす？ :");

            int myhand = scanner.nextInt();
            if(myhand > 2) {
                System.out.println("エラーです。");
                continue;
            }

            String cpuhand;
            if(cpu == 0) {
                cpuhand = "パー";
            }else if(cpu == 1) {
                cpuhand = "チョキ";
            }else if(cpu == 2) {
                cpuhand = "グー";
            }else {
                cpuhand = "エラー";
            }

            System.out.println("コンピュータは" + cpuhand);
            if(cpu == myhand) {
                System.out.println("あいこです。");
                cont = true;
            }else if((myhand - cpu == 1) || (myhand - cpu == -2)) {
                System.out.println("あなたの勝ち。");
                cont =  false;
            }else if((myhand - cpu == -1) || (myhand - cpu == 2)) {
                System.out.println("あなたの負け。");
                cont = false;
            }
        }
    }
}