import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] str_arr = str.split("-"); //0 ~ 숫자가 담겨져있고
        
        int sum = 0;
        for(int i=0; i < str_arr.length;i++){
            String[] plus = str_arr[i].split("\\+");
            
            for(int j =0; j < plus.length;j++){
                if(i==0){//
                    sum += Integer.parseInt(plus[j]);
                }
                else
                    sum -= Integer.parseInt(plus[j]);
            }
        }

            System.out.println(sum);
        }
    }

