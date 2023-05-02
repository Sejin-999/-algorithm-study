n = int(input())
n_list = []

for _ in range(0,n):
    n_list.append(int(input()))

#1 산술평균 - n개합 / n
sum = 0
for i in n_list:
    sum += i
    
print(round(sum // n, 0)) 


#2 중앙값 -증가순 나열 . 중앙값

n_list.sort()
middle_n = round(n//2 , 0)
print(n_list[middle_n])

#3 최빈값 - 제일 많이나오는 수 - 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
n_dic = dict()

for i in n_list:
    if i in n_dic:
        n_dic[i] +=1
    else:
        n_dic[i] = 1
        
max_count = max(n_dic.values())
max_list = []

for i in n_dic:
    if max_count == n_dic[i]:
        max_list.append(i)

if len(max_list) > 1:
    print(max_list[1])
else:
    print(max_list[0])


#4 범위 : N개의 수들 중 최댓값과 최솟값의 차이
max = len(n_list)-1
dd =  n_list[max] - n_list[0]
print (dd)

