def solution(before, after):
    b=''.join(sorted(before))
    a=''.join(sorted(after))
    if b==a:
        return 1
    else:
        return 0