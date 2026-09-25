# #1
# a = '111111110'
# b = '1110011'
#
# a = a[::-1]
# b = b[::-1]
# c=0
# r=[]
# for i in range(max(len(a),len(b))):
#     da = int(a[i]) if i<len(a) else 0
#     db = int(b[i]) if i<len(b) else 0
#     s = da+db+c
#     r.append(str(s%2))
#     c = s//2
# if c==1:
#     r.append('1')
# print(''.join(reversed(r)))
from ctypes import c_char

# #2
# a = '43251'
# b = '1231321102'
#
# a = a[::-1]
# b = b[::-1]
# c=0
# r=[]
# for i in range(max(len(a),len(b))):
#     da = int(a[i]) if i<len(a) else 0
#     db = int(b[i]) if i<len(b) else 0
#     s = da+db+c
#     r.append(str(s%6))
#     c = s//6
# if c:
#     r.append(str(c))
# print(''.join(reversed(r)))

#3
a = '321'
b = '2131'
a = a[::-1]
b = b[::-1]

c = 0
r=[]
for i in range(max(len(a),len(b))):
    da =  int(a[i]) if i<len(a) else 0
    db =  int(b[i]) if i<len(b) else 0
    d = da-db-c
    if d<0:
        d+=2
        c = 1
    else:
        c=0
    r.append(str(d))
