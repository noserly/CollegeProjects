# #1
# bin = '110110'
# print(int(bin,2))
# print('1*2**5+1*2**4+1*2**1+1*2**1=54')

# #2
# binary = input("Введите двоичное число: ").strip()
# alphabet = "0123456789ABCDEF"
# while len(binary) % 4 != 0:
#     binary = "0" + binary
# hex_number = ""
# for i in range(0, len(binary), 4):
#     group = binary[i:i+4]
#     hex_number += alphabet[int(group, 2)]
# print("Шестнадцатеричное представление:", hex_number)

# #3
# oct = 36
# print(bin(oct)[2:])

# #4
# hex = '1A308'
# cc = int(hex,16)
# print(bin(int(cc))[2:])

# #5
# def to_binary(number: str, base: int, alphabet="0123456789ABCDEF") -> str:
#     bits = int.bit_length(base - 1)
#     result = ""
#     for ch in number.upper():
#         value = alphabet.index(ch)
#         result += format(value, f"0{bits}b")
#     return result
#
# def from_binary(binary: str, base: int, alphabet="0123456789ABCDEF") -> str:
#     bits = int.bit_length(base - 1)
#     while len(binary) % bits != 0:
#         binary = "0" + binary
#     result = ""
#     for i in range(0, len(binary), bits):
#         result += alphabet[int(binary[i:i+bits], 2)]
#     return result
#
# num = input("Введите число: ")
# b1 = int(input("Исходное основание (2,8,16): "))
# b2 = int(input("Целевое основание (2,8,16): "))
#
# binary = to_binary(num, b1)
# converted = from_binary(binary, b2)
#
# print("Промежуточное двоичное представление:", binary)
# print("Результат перевода:", converted)

# #7
# print('Преимущества прямого метода\
# Прямой метод перехода:\
# не требует вычислений;\
# исключает округления;\
# эффективен при аппаратной и программной обработке данных;\
# широко используется в системном программировании и отладке.')