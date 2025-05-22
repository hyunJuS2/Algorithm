import java.util.*;

public class Main{
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); //test_case개수
            
        for(int i = 0 ; i < T; i++){
            int num = sc.nextInt();
            String binary = Integer.toBinaryString(num);
           
            for(int j = 0; j < binary.length(); j++){
                if(binary.charAt(binary.length() - 1 - j) == '1'){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}