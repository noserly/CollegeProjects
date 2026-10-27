# message = 'BCDABCD'
# code = {"B":"01",'A':"00","C":"10","D":"11"}
# dcode = {'00':'A','01':'B','10':'C','11':'D'}
# encode = ''
# for i in message:
#     encode += code[i]
# print(len(encode))
# print(encode)
# decode=''
# for i in range(0,len(encode),2):
#     c = encode[i:i+2]
#     decode += dcode[c]
# print(decode)
# if message==decode: print('совпадает')
