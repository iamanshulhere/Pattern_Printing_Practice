public class pattern18 {
    public static void pattern(int n){
        int start = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }

    public static void print(int blocks, int n){
        for(int b = 1; b <= blocks; b++){
            int start = 1;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(start + " ");
                    start++;
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        // pattern(3);
        // pattern(3);
        print(2, 3);
    }
}
