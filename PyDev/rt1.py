from math import *
from random import *
def I(n):
    return log2(n)
def H(p):
    return -sum(pi*log2(pi) for pi in p)
#1
n = 64
print(I(n))
#2
p = [0.1]*10
print(H(p))
#3
p = [0.4,0.3,0.2,0.1]
print(H(p))
#4
p = [0.2]*5
print(H(p))
#5
p = [0.6,0.3,0.1]
print(H(p))
#6
p = [randint(1,10) for i in range(8)]
s = [x/sum(p) for x in p]
print(H(s))