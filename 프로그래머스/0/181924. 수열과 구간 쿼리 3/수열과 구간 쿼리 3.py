def solution(arr, queries):
    for query in queries:
        idx1 = query[0]
        idx2 = query[1]
        
        temp = arr[idx1]
        arr[idx1] = arr[idx2]
        arr[idx2] = temp
    
    return arr

# 파이썬은 튜플 언패킹이 된다는 점!
# for idx1, idx2 in queries:
#     arr[idx1], arr[idx2] = arr[idx2], arr[idx1]