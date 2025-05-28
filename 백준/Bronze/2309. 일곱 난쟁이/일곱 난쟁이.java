import java.util.*;

class Main{
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        int []heights = new int[9];
        int sum = 0;
        
        for(int i = 0; i < 9; i++){
            heights[i] = sc.nextInt();
            sum += heights[i];
        }
        // sum - 두개의 합 = 100
        outer:
        for(int  i = 0; i < 9; i++){
            for(int j = i+1; j < 9; j++){
                if(sum - heights[i] - heights[j] == 100){
                    heights[i] = heights[j] = -1;
                    break outer;
                }
            }
        }
        
        Arrays.sort(heights);
        for(int h : heights){
            if(h != -1) System.out.println(h);
        }
    }
}