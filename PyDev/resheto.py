# #1
# a = int(input())
# b = int(input())
# c = int(input())
# def nod(a,b):
#     while True:
#         cel = 0
#         if a%b==0 or b%a==0:return min(a,b)
#         if a>b:
#             cel = a%b
#             a = cel
#         elif b>a:
#             cel = b%a
#             b = cel
# print(nod(nod(a,b),c))
# #2
# def resheto_eratosfena(n):
#     arr = list(range(n+1))
#     arr[1]=0
#     for p in range(2, int(n ** 0.5) + 1):
#         if arr[p]!=0:
#             for x in range(p * p, n + 1, p):
#                 arr[x]=0
#     arr = [x for x in arr if x!=0]
#     return arr
#
# a = int(input())
#
# def fact(arr,n):
#     r = []
#     c = 0
#     while n!=1:
#         p = arr[c]
#         if n%p==0:
#             r.append(p)
#             n = n//p
#             continue
#         c+=1
#     return r
#
# arr = resheto_eratosfena(a)
# x = fact(arr,a)
# y = set(x)
# r = [f'{i}^{x.count(i)}' for i in y]
# print(r)

# #3
# from math import *
#
# n = int(input())
# def ferma(n):
#     r=[]
#     a = isqrt(n)
#     if a*a<n:
#         a+=1
#     while True:
#         b2 = a*a -n
#         b = isqrt(b2)
#         if b*b==b2:
#             r.append(a-b),r.append(a+b)
#             return r
#         a+=1
# #алгоритм ферма раскладывает на множители в виде (a-b)*(a+b)
# #потом нам нужно факторизовать эти множители на простые числа со степенями
# def fac(n):
#     arr = list(range(n+1))
#     arr[1]=0
#     for p in range(2, int(n ** 0.5) + 1):
#         if arr[p]!=0:
#             for x in range(p * p, n + 1, p):
#                 arr[x]=0
#     arr = [x for x in arr if x!=0]
#     r = []
#     c = 0
#     while n!=1:
#         p = arr[c]
#         if n%p==0:
#             r.append(p)
#             n = n//p
#             continue
#         c+=1
#     return r
# x = fac(ferma(n)[0])+fac(ferma(n)[1])
# y = set(x)
# r = [f'{i}^{x.count(i)}' for i in y]
# print(r)

# #4
# p = int(input())
# s = 4
# M = 2**p-1
# for _ in range(p-2):
#     s = (s**2-2)%M
# if s==0:print(f'чиисло мерсона с индексом {p} простое')
# else: print('Составное')

# #5
# x = int(input())
# def neiman(x):
#     s = []
#     for i in range(10):
#         r = int(str(x**2)[2:7])
#         s.append(r)
#         x = r
#     return s
# print(neiman(x))

# #6 
# def resheto_sudurama(n):
#     n1 = (n-1)//2
#     s = list(range(1,n1+1))
#     ind = []
#     for i in range(1, n1 + 1):
#         for j in range(i,20):
#             k = i+j+2*i*j
#             if k in s:ind.append(k)
#     arr = [x for x in s if x not in ind]
#     res = [x*2+1 for x in arr]
#     res = [2]+res
#     return res
# print(resheto_sudurama(100))