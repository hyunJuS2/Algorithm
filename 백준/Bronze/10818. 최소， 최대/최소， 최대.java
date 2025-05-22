import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String arg[]) throws IOException{
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(min > num) min = num;
            if(max < num) max = num;
        }
        System.out.print(min+ " " + max);
    }
}