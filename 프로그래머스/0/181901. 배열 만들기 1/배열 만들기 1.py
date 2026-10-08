def solution(n, k):
    answer = []
    for i in range(n//k):
        answer.append(k*(i+1))
    return answer