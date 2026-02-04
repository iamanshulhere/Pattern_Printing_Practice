public class pattern13 {
    public static void pattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            int num = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void print(int n){
        for(int i = 0; i < n; i++){
            int num = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");
                num = num * (i - j)/(j + 1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
        print(5);
    }
}
