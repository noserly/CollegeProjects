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

#3
def resheto_eratosfena(n):
    arr = list(range(n+1))
    arr[1]=0
    for p in range(2, int(n**0.5)+1):
        if arr[p]!=0:
            for x in range(p*p,n+1,p):
                arr[x]=0
    arr=[x for x in arr if x!=0]
    return arr
