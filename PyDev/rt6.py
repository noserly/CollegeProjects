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

# #3
# a = "725"
# b = "3465"
# base = 8
# a = a[::-1]
# b = b[::-1]
# borrow = 0
# result = []
# for i in range(len(a)):
#     da = int(a[i]) - borrow
#     db = int(b[i]) if i < len(b) else 0
#     if da < db:
#         da += base
#         borrow = 1
#     else:
#         borrow = 0
#     result.append(str(da - db))
# print("".join(reversed(result)))

# 4
# a = "243"
# b = "134"
# base = 5
# a = a[::-1]
# b = b[::-1]
# carry = 0
# result = []
# for i in range(max(len(a), len(b))):
#     da = int(a[i]) if i < len(a) else 0
#     db = int(b[i]) if i < len(b) else 0
#     s = da + db + carry
#     result.append(str(s % base))
#     carry = s // base
# if carry:
#     result.append(str(carry))
# print("".join(reversed(result)))

#5
# a = '234'
# b = '324'
# base = 8
# a = a[::-1]
# b = b[::-1]
# borrow = 0
# r = []
# for i in range(len(a)):
#     da = int(a[i])-borrow
#     db = int(b[i]) if i<len(b) else 0
#     if da<db:
#         da += base
#         borrow = 1
#     else:
#         borrow = 0
#     r.append(str(da-db))
# print(''.join(reversed(r)))

a = "725"
b = "346"
base = 9
a = a[::-1]
b = b[::-1]

carry = 0
result = []

for i in range(max(len(a), len(b))):
    da = int(a[i]) if i < len(a) else 0
    db = int(b[i]) if i < len(b) else 0
    s = da + db + carry
    result.append(str(s % base))
    carry = s // base
if carry:
    result.append(str(carry))
print("".join(reversed(result)))
borrow = 0
result_s = []
for i in range(len(a)):
    da = int(a[i]) - borrow
    db = int(b[i]) if i < len(b) else 0
    if da < db:
        da += base
        borrow = 1
    else:
        borrow = 0
    result.append(str(da - db))
print("".join(reversed(result_s)))