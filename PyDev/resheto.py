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

#2
def resheto_eratosfena(n):
    arr = list(range(2,n+1))
    for p in range(len(arr)):
        if arr[p]!=0:
            for x in range(p+1,len(arr)):
                if arr[x]%arr[p]==0: arr[x]=0
    arr = [x for x in arr if x!=0]
    return arr
