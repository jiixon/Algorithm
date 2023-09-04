def solution(number):
    hub=0
    for i in number:
        hub+=int(i)
    return hub%9