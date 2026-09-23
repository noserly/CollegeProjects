# def bin_search(array,find_count):
#     first = 0#первый индекс
#     last = len(array)-1#ищем крайний индекс
#     while first<=last:#повторяем, пока крайний левый и крайний правый индексы не сойдутся на одном элементе
#         mid_index = first + (last - first) // 2#серединный индекс
#         mid_value = array[mid_index]#значение которое находится по серединному индексу
#         if mid_value==find_count: return mid_index#если среднее значение равно искомому элементу то ретерн\
#         # (границы настолько сошлись так, что других серединных элементов быть не может: в конечном срезе остался один\
#         # элемент, который и будет ответом)
#         if find_count<mid_value:#если мид больше искомого, то мид-1 станет верхнейё
#             # (если по индексу мид не искомое, то нам не надо больше его проверять. поэтому -1)
#             last=mid_index-1
#         elif find_count>min_value:#так же работает в обратную сторону
#             first=mid_index +1
#     return 'Element not found'
# a = [1,2,3,4,9,13,16,34]
# print(bin_search(a,34))
from itertools import count

# def bin_search(a,k):
#     l=0
#     r = len(a)-1
#     while r>=l:
#         m = l+(r-l)//2
#         mv = a[m]
#         if mv==k: return m
#         elif mv<k:
#             l = m+1
#         else:
#             r = m-1
#     if k not in a:
#         a.insert(r,k)
#         return l
#     return 'index not found'
# a = [1,3,5,6,7,11]
# print(bin_search(a,12))

# def bin_s_peak(arr):
#     l=0
#     r = len(arr)-1
#     if arr[l]>arr[l+1] or arr[r]>arr[r-1]:
#         return 'Пика не найдено'
#     while l<r:
#         mid = l+(r-l)//2
#         midv = arr[mid]
#         if arr[mid-1]<midv and midv>arr[mid+1]:
#             return mid
#         if arr[mid-1]>=midv:
#             r = mid
#         if arr[mid + 1] <= midv:
#             l = mid
#     return 'Пика не найдено'
# arr = [1,3,2]
# print(bin_s_peak(arr))
#
# def bin_s_3(arr):
#     index_of_negative=[]
#     l=0
#     r = len(arr)-1
#     if r<0: return "Больше отрицательных"
#     if l>0: return "Больше положительных"
#     while l<r:
#         mid = l+(r-l)//2
#         midv = arr[mid]
#         if midv>0:
#             if arr[mid-1]<0:
#                 index_of_negative.append(mid-1)
#                 break
#             else: r = mid-1
#         elif midv<0:
#             index_of_negative.append(mid)
#             if arr[mid+1]>0:
#                 index_of_negative.append(mid+1)
#                 break
#             else: l = mid+1
#     if len(index_of_negative) == 0: return len(arr)
#     index_of_negative = index_of_negative[-1:]
#     if len(index_of_negative)==len(arr)-1:return len(index_of_negative)
#     count_of_neg = index_of_negative[0]+1
#     count_of_pos = len(arr)-count_of_neg
#     if count_of_pos>count_of_neg:return count_of_pos
#     if count_of_pos < count_of_neg: return count_of_neg
# arr = [-1,1]
# print(bin_s_3(arr))

# nums = [5,2,6,1]
# count = []
# for i in range(len(nums)):
#     a = [nums[x] for x in range(i+1,len(nums)) if nums[x]<nums[i]]
#     count.append(len(a))
# print(count)