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