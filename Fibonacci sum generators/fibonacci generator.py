def fib_seq():
    list = [0,1]
    for i in range(18):
        list.append(list[-1]+list[-2])
    return sum(list)

def fib_seqV2():
    seclast=0
    last=1
    total=1
    for i in range(18):
        temp=last+seclast
        seclast=last
        last=temp
        total+=last
    return total

print(fib_seq())
print(fib_seqV2())
