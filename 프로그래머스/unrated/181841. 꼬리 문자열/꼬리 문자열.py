def solution(str_list, ex):
    result=[i for i in str_list if ex not in i]
    return ''.join(result)
