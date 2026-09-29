words = input().strip()
print(*words, sep = "\n")

# 주의 split은 구분자가 꼭 필요함. ('') -> 이거 불가능. 
# 게다가 split을 하게 되면 데이터 타입이 list형태로 변환됨.

# 결론 : 그래서 list() 함수로 감쌀 필요도 없고, .split()을 사용할 수 도 없다~ *이걸 사용하면 문자열 자체를 나눠준다~
