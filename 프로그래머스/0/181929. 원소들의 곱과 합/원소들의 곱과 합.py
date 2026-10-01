def solution(num_list):
    mul = 1
    for n in num_list:
        mul *= n
    sum_list = (sum(num_list))**2
    
    return 1 if mul < sum_list else 0 
