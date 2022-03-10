public class ControlStructure9 {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            if(i % 2 == 0){
                System.out.print("i=" + i);
                System.out.println(" 偶数ですね。");
            }else {
                System.out.print("i=" + i);
                System.out.println(" 奇数ですね。");
            }
        }
    }
}