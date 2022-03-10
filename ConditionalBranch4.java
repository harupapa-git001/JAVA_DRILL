public class ConditionalBranch4 {
    public static void main(String[] args) {
        int x = 5;
        switch(x) {
            case 3: System.out.println("xは3です。");
                break;
            case 4: System.out.println("xは4です。");
                break;
            case 5: System.out.println("xは5です。");
                break;
            default: System.out.println("xは3~5以外の数字です。");
                break;
                
        }
    }
}