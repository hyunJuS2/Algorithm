/* 문제 설명
약수 구하기
1. N은 1 이상 10,000 이하, K는 1 이상 N 이하
2. N의 약수를 구하고 그 중 K번째로 작은 수를 출력
3. 약수의 개수가 K보다 작을 경우 0 출력
*/

import java.util.*;

public class Main{
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> div = new ArrayList<>();
        
        for(int i = 1; i * i <= N; i++){
            if(N % i == 0){
               div.add(i);
                 if(i!= N/i){
                    div.add(N/i);
                }          
            }
        }
        
        Collections.sort(div);
        
        if(div.size() >= K){
            System.out.print(div.get(K-1));
        }
        else System.out.print(0);
    }
}