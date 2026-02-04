public class pattern12 {
    public static void pattern(int n){
        for(int i = 1; i <= 2 * n - 1; i++){
            int space, star;
            if(i  <= n){
                space = i - 1;
                star = 2 * (n - i) + 1;
            }
            else{
                space = 2 * n - i - 1;
                star = 2 * (i - n) + 1;
            }

            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= star; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(3);
    }
}
