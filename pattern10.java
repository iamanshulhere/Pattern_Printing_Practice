public class pattern10 {
    public static void pattern(int n){
        int start = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(start);

                if(start == 1){
                    start--;
                }
                else{
                    start++;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
