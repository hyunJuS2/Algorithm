# 1. str1과 str2에서 문자를 하나씩 가져와야 한다.
# 2. 두 문자열의 길이가 같으므로 같은 인덱스로 접근할 수 있다. -> 구분자가 없어서 split 불가. / list도 가능하지만 굳이?
# 3. range(len(str1))으로 0부터 마지막 인덱스까지 반복한다.
# 4. str1[i]와 str2[i]를 순서대로 answer에 추가한다. -> +=을 해야 answer에 이미 있는 문자열 뒤에 추가가 된다는 점!
# 5. 완성된 answer를 반환한다.

def solution(str1, str2):
    answer = ''
    for i in range(len(str1)):
        answer += str1[i] + str2[i]
    return answer