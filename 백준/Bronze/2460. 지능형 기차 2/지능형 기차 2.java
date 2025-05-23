import java.util.*;

public class Main{
    public static void main(String arg[]){
        
        int max = 0;
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            int out = sc.nextInt();
            int in = sc.nextInt();
            
            count -= out;
            count += in;
            
            if(count > max) max = count;
        }
        System.out.print(max);
    }
}