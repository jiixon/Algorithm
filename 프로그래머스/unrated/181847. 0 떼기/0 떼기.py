def solution(n_str):
    if n_str[0]=="0":
        for i in range(0,len(n_str)+1):
            if n_str[i] !="0":
                return n_str[i:]
    else:
        return n_str