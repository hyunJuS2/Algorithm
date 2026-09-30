# 일단 하나씩 빼야하는데 split은 안되고, 

def solution(str1, str2):
    answer = ''
    for i in range(len(str1)):
        answer += str1[i] + str2[i]
    return answer