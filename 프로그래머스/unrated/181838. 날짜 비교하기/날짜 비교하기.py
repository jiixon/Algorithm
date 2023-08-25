def solution(date1, date2):
    for i,j in zip(date1,date2):
        if i > j:
            break
        elif i == j:
            pass
        else:
            return 1
    return 0