def solution(num_list):
    gob=1
    if len(num_list)>=11:
        return sum(num_list)
    else:
        for i in num_list:
            gob*=i
        return gob