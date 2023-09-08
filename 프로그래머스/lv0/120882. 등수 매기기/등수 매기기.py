def solution(score):
    answer=[sum(score[[i][0]])/2 for i in range(0,len(score))]
    answer_set=sorted(answer)
    answer_set.reverse()
    return [answer_set.index(i)+1 for i in answer]