# #1
# message = '101011'
# code = message + str(message.count('1')%2)
# print(code)

# #2
# print('Не обнаружены')

# #3
# m1 = '1101011'
# m2 = '1000110'
# d = sum(x!=y for x,y in zip(m1,m2))
# print('расстояние хэмминга',d)

# #4
# m = '110110'
# def tripe(m):
#     return ''.join('111' if b=='1' else '000' for b in m)
# print(tripe(m))

# #5
# def tripe(m):
#     return ''.join('111' if b=='1' else '000' for b in m)
# m = '11000110'
# r = tripe(m)
# broken = list(r)
# broken[4] = "0" if broken[1] == "1" else "1"
# d = "".join(broken)
#
# def maj(triple: str)->str:
#     return '1' if triple.count('1')>=2 else '0'
#
# decode = ''.join(maj(d[i:i+3]) for i in range(0,len(d),3))
#
# print(decode)

# #6
# m = '1001'
# ex = 'xx1x001'
# def he(data_bits: str)->str:#кодируем с пом хэм
#     d1,d2,d3,d4 = (int(x) for x in data_bits)
#     p1 = d1^d2^d4
#     p2 = d1^d3^d4
#     p4 = d2^d3^d4
#     code = [p1,p2,d1,p4,d2,d3,d4]
#     return ''.join(str(x) for x in code)
# print(he(m))

