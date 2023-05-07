from collections import deque
import sys

#t = int(input())
t = int(sys.stdin.readline())

for _ in range(0,t):
    # p = list(input())
    p = sys.stdin.readline().strip()
    # n = int(input())
    n = int(sys.stdin.readline())
    n_list = sys.stdin.readline().strip()[1:-1].split(",")
    # n_list = list(input())
    # # 문자 지우기
    # for i in n_list:
    #     if i == "[" or i == "]" or i == ",":
    #         n_list.remove(i)
    
    que = deque([])
    # 큐에 리스트값 넣기
    for i in n_list:
        que.append(i)
    
    for i in p:
        
        if i == "R":
            #뒤집기
            que.reverse()
        elif i == "D":
            #버리기
            que.popleft()
    
    if len(que) < 1:
        print("error")
    else:
        print("[", end="")
        for i in range(len(que)):
            print(que[i], end="")
            if i != len(que)-1:
                print(",", end="")
        print("]")
