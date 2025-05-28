import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(fibo(n));
    }

    public static int fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int a = 0;
        int b = 1;
        int temp = 0;
        
        for(int i = 2; i<= n; i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        return b;
    }
}
    