def solution(a, b):
    a = str(a)
    b = str(b)
    
    if int(str(a+b)) >= int(str(b+a)):
        return int(a+b)
    else : return int(b+a)