# #1
# al = {'a':'00','b':'01','c':'11'}
# mes = 'aaacbaccac'
# e = ''.join(al[c] for c in mes)
# print(e)

# #2
# al = {'a':'0','b':'10','c':'11'}
# mes = 'aaacbaccac'
# e = ''.join(al[c] for c in mes)
# print(e,len(e)/len(mes))

# #3
# t = 'aaacbaccac'
# utf = t.encode('utf-8')
# b = [format(b, '08b') for b in utf]

# #4
# inp = '00000011010011110011'
# al = {'00':'a','01':'b','11':'c'}
# res = ''
# for i in range(0,len(inp),2):
#     p = str(inp[i:i+2])
#     res+=al[p]
# print(res)

# #5
# len_fix=0
# len_unfix=0
# len_utf=0
# t = 'aaacbaccac'
# al_fix = {'a':'00','b':'01','c':'11'}
# al_unfix = {'a':'0','b':'01','c':'11'}
# utf = t.encode('utf-8')
# b = [bin(c)[2:] for c in utf]
# len_fix = len(''.join(al_fix[p] for p in t))*8
# len_unfix = len(''.join(al_unfix[p] for p in t))*8
# len_utf = len(b)*8
# print(f'v_fix {len_fix}')
# print(f'v_unfix {len_unfix}')
# print(f'v_utf {len_utf}')