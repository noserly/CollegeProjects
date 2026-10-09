# #1
# x = 3.4235
# n = 4
# m =  int(round(x*2**n))
# b = f'{m:08b}'
# print(b)

# #2
# def kod(x,n):
#     m = int(round(x * 2 ** n))
#     b = f'{m:08b}'
#     return b
# def decod(b,n):
#     x = int(b,2)/2**n
#     return x
# x = kod(4.234,5)
# r = decod(x,5)
# print(x,r)

# #3
# чем больше масштаб тем больше точность дробного числа

# #4
# import math
# x = 10.5
# mantissa, exponent = math.frexp(x)
# print(mantissa, exponent)

# #5
# import math
# x = 10.5
# mantissa, exponent = math.frexp(x)
# print(mantissa, exponent)

# #6
# по мере роста у плавающей точке точность уменьшается в то время как у фиксированной точность постоянна

# #7
# x = 0.1
# y = x + x + x + x + x+x+x+x+x+x
#
# print(y)
# print(y == 1.0)

# #8
# from math import *
# data = [1e16, 1.0, -1e16, 1.0, 1.0]
# print("как есть:        ", sum(data))
# print("сначала малые:   ", sum(sorted(data, key=abs)))
# print("сначала большие: ", sum(sorted(data, key=abs, reverse=True)))
# print("fsum (эталон):   ", fsum(data))