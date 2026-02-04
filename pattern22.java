public class pattern22 {
    public static void pattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2 * i; j++){
                System.out.print(" ");
            }
            for(int j =  2 * n - 1 - i; j >= i + 1; j--){
                char ch = (char)('A' + j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        for(int i= n - 2; i >= 0; i--){
            for(int j = 0; j < 2 * i; j++){
                System.out.print(" ");
            }

            for(int j = i + 1; j <= 2 * n - 1 - i; j++){
                char ch = (char)('A' + j - 1);
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern(5);
    }
}
