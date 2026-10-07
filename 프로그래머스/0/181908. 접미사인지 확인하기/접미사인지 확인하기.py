def solution(my_string, is_suffix):
    answer = 0
    suffix = []
    for i in range(len(my_string)):
        suffix.append(my_string[i:])
    if is_suffix in suffix:
        answer = 1
    return answer