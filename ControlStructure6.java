public class ControlStructure6 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("0, 3, 6, と0から+3ずつ18まで表示します。");
        do {
            System.out.println("i=" + i);
            i = i + 3;
        }while(i <= 18);

    }
}