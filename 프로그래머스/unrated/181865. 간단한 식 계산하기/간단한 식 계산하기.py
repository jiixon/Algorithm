def solution(binomial):
    b_list = binomial.split(' ')
    if b_list[1] == '+':
        return int(b_list[0]) + int(b_list[2])
    elif b_list[1] == '-':
        return int(b_list[0]) - int(b_list[2])
    else:
        return int(b_list[0]) * int(b_list[2])