public class pattern17 {
    public static void pattern(int n){
        for(int i = 1; i <= n; i++){
            int start = 1;
            for(int j = n; j >= i; j--){
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
