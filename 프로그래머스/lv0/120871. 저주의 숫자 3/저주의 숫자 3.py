def solution(n):
    n_list=[]
    i=1
    while i<230:
        if i%3 == 0:
            n_list.append(i+1)
            i+=1
        else:
            n_list.append(i)
        i+=1
    result=[r for r in n_list if '3' not in str(r)]
    return result[n-1]
    
    