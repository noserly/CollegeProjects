# #1
# a = 67
# b = f'{a:08b}'
# print(b)

# #2
# a = 69
# bit = 8
# b = f'{a:{bit-1}b}'
# r = '1'+b
# print(r)

# #3
# a = 52
# bit = 8
# b = format(a,f'0{bit-1}b')
# i = ''.join('1' if x=='0' else '0' for x in b)
# i = '1'+i
# print(i)

# #4
# a = 42
# bit = 8
# b = format(a,f'0{bit-1}b')
# i = ''.join('1' if x=='0' else '0' for x in b)
# i = '1'+i
# r = format(int(i,2)+1,f'0{bit-1}b')
# print(r)

# #5
# a = abs(-15)
# bit = 8
# b = format(a,f'0{bit-1}b')
# i = ''.join('1' if x=='0' else '0' for x in b)
# i = '1'+i
# r = format(int(i,2)+1,f'0{bit-1}b')
# print(r)
#
# i = ''.join('1' if x=='0' else '0' for x in b)
# i = '1'+i
# print(i)
#
# r = '1'+b
# print(r)

# #6
# a = abs(-15)
# bit = 8
# b = format(a,f'0{bit-1}b')
# i = ''.join('1' if x=='0' else '0' for x in b)
# i = '1'+i
# r = format(int(i,2)+1,f'0{bit-1}b')
# print(r)
#
# i = ''.join('1' if x=='0' else '0' for x in b)
# i = '1'+i
# print(i)
#
# r = '1'+b
# print(r)