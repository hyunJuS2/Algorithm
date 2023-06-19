import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        // bce, bcd, dx
//        String[] sample = {"bce", "bcd", "dx"};
//        Arrays.sort(sample);
//        System.out.println(Arrays.toString(sample));

        //2.
        // 각 단어마다 n번째부터 자른 값을 넣어서 배열에 삽입
        ArrayList <String> arr = new ArrayList<>();
        for(int i = 0; i < strings.length; i++){
            arr.add(strings[i].charAt(n)+ strings[i]);
            // arr = {"babc", "bab"}
        }
        String[] arr2 = new String[arr.size()];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr.get(i);
        }

        Arrays.sort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            answer[i] = arr2[i].substring(1);
        }

        return answer;
    }
}