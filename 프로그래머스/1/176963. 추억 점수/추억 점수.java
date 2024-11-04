import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
      Map<String, Integer> yearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }
        
        int[] result = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (String person : photo[i]) {
                score += yearningMap.getOrDefault(person, 0); 
            }
            result[i] = score;
        }
        
        return result;
    }
}