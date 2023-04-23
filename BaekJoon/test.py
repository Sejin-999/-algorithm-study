n = int(input())

for i in range(1,n+1):
    temp_list= list(map(int, str(i)))
    temp_list_len = len(temp_list)
    print_sum = i
    sum = i
    for j in range(temp_list_len):
        sum += temp_list[j]
    
    if sum == n :
        print(print_sum)
        break