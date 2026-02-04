public class pattern8 {
    public static void pattern(int n){
        int space, star;
        for(int i = 0; i < 2 * n - 1; i++){
            if(i < n){
                space = n - i - 1;
                star = 2 * i + 1;
            }
            else{
                space = i - n + 1;
                star = 2 * (2 * n - i - 2) + 1;
            }

            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
