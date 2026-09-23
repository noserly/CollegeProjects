# #1
# def cc(n,p):
#     s=0
#     n = ''.join(reversed(n))
#     for i in range(len(n)):
#         s+=p**i*int(n[i])
#     return s
# print(cc('312',4))

# #2
# def cc(x,p):
#     s=''
#     while x:
#         s=str(x%p)+s
#         x=x//p
#     return s
# print(cc(45,3))

# #3
# number = input("Введите число: ").upper()
# base = int(input("Введите основание системы: "))
# alphabet = "0123456789ABCDEF"
#
# value = 0
# for i, ch in enumerate(reversed(number)):
#     digit = alphabet.index(ch)
#     value += digit * (base ** i)

# #4
# def to_decimal(number: str, base: int, alphabet: str = "0123456789ABCDEF") -> int:
#     if not (2 <= base <= len(alphabet)):
#         raise ValueError("Недопустимое основание системы.")
#
#     value = 0
#     for i, ch in enumerate(reversed(number.upper())):
#         if ch not in alphabet:
#             raise ValueError("Недопустимый символ.")
#         digit = alphabet.index(ch)
#         if digit >= base:
#             raise ValueError("Цифра не принадлежит данной системе счисления.")
#         value += digit * (base ** i)
#     return value
#
#
# def from_decimal(number: int, base: int, alphabet: str = "0123456789ABCDEF") -> str:
#     if not (2 <= base <= len(alphabet)):
#         raise ValueError("Недопустимое основание системы.")
#     if number == 0:
#         return "0"
#
#     digits = []
#     n = number
#     while n > 0:
#         digits.append(alphabet[n % base])
#         n //= base
#     return ''.join(reversed(digits))
#
#
# n = int(input("Введите десятичное число: "))
# b = int(input("Введите основание системы: "))
#
# converted = from_decimal(n, b)
# restored = to_decimal(converted, b)
#
# print("Результат перевода:", converted)
# print("Проверка обратным переводом:", restored)



# #6
# print('Чем больше система счисления, тем короче длина числа')