def pryam(a,bit):
    b = f'{a:{bit - 1}b}'
    r = '1' + b
    return r
def invert(a,bit):
    b = format(a, f'0{bit - 1}b')
    i = ''.join('1' if x == '0' else '0' for x in b)
    i = '1' + i
    return i
def dop(a,bit):
    b = format(a, f'0{bit - 1}b')
    i = ''.join('1' if x == '0' else '0' for x in b)
    i = '1' + i
    r = format(int(i, 2) + 1, f'0{bit - 1}b')
    return r
def to_twos_complement(x, bits):
    if x >= 0:
        return x
    return (1 << bits) + x
def add_twos_complement(a, b, bits):
    mask = (1 << bits) - 1
    result = (a + b) & mask
    return result
# #1
# bits = 8
# a = to_twos_complement(69, bits)
# b = to_twos_complement(52, bits)
# result = add_twos_complement(a, b, bits)
# signed_result = result if result < (1 << (bits - 1)) else result - (1 << bits)
# print(signed_result)

#2
# a = 69
# b=52
# print(a+(-b))

# #3
# bits = 8
# a = to_twos_complement(100, bits)
# b = to_twos_complement(50, bits)
#
# result = add_twos_complement(a, b, bits)
# signed_result = result if result < (1 << (bits - 1)) else result - (1 << bits)
#
# print(signed_result)

# #4
# print("чем больше разрядность тем больше диапазон представимых чисел")

# #5
# import math
# x = 12.75
# mantissa, exponent = math.frexp(x)
# print(mantissa, exponent)

# #6
# import math
# x = 14.88
# mantissa, exponent = math.frexp(x)
# print(mantissa, exponent)