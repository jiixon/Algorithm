def solution(num_list):
    gob=1
    for i in num_list:
        gob*=i
        
    if gob<(sum(num_list))**2:
        return 1
    else:
        return 0