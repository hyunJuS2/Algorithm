def solution(a, b, flag):
    return a+b if flag else a-b

    answer = 0
    if flag:
        answer = a+b
    else:
        answer = a-b
    return answer
