import sys
n = int(sys.stdin.readline())
# n = int(input())
count = 0;
sum = 0

for i in range(0,n) :
    for j in range(0,n):
        #sum += i*j
        # print(f"{i} * {j} = {sum}")
        count +=1
        
print(count)
print(2) # i , j -> x x  -> 2
