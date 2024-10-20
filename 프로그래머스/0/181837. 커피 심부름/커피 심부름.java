class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int americanoPrice = 4500;
        int cafeLattePrice = 5000;
        int americanoCount = 0;
        int cafeLatteCount = 0;
        
        // 각 주문을 확인
        for (String drink : order) {
            if (drink.contains("americano")) {
                americanoCount++;
            } else if (drink.contains("cafelatte")) {
                cafeLatteCount++;
            } else if (drink.equals("anything")) {
                americanoCount++; // "아무거나"는 차가운 아메리카노로 처리
            }
        }
        
        answer = (americanoCount*americanoPrice) + (cafeLatteCount*cafeLattePrice);
        return answer;
    }
}