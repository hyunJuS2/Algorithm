def solution(my_strings, parts):
    answer = ''
    for strs, part in zip(my_strings, parts):
        answer += strs[part[0]:part[1] + 1]
    return answer