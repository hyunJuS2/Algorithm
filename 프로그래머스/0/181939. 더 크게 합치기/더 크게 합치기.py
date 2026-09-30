def solution(a, b):
    a = str(a)
    b = str(b)
    
    if a + b >= b + a:
        return int(a + b)
    else : return int(b + a)