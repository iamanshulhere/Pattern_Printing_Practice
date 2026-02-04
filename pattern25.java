public class pattern25 {
    public static void pattern(int n){
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                int start = 1;
                for(int j = 1; j <= i; j++){
                    System.out.print(start + " ");
                    start++;
                }
                System.out.println();
            }
            else{
                char ch = 'A';
                for(int j = 1; j <= i; j++){
                    System.out.print(ch + " ");
                    ch++;
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
