from math import *
def f(x):
    return e**(x-1)-x**3-x
l = 0
r = 1
eps = 0.001
while abs(r-l)>eps:
    x = l-((f(l)*(r-l))/(f(r)-f(l)))
    if f(l)*f(x)>0:
        l=x
    else:
        r=x
    print(x,f(x))
