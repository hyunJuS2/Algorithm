def solution(my_string, indices):
    answer = ''
    for i, ch in enumerate(my_string):
        if i not in indices:
            answer += ch
    return answer