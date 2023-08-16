def solution(strArr):
    answer=[]
    [answer.append(i) for i in strArr if "ad" not in i]
    return answer
