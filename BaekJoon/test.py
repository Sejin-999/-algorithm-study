import sys
from collections import deque

n = int(sys.stdin.readline())
que = deque(range(1, n+1))

while len(que) > 1:
    # 큐 맨 앞의 원소 건너뛰기
    que.popleft()
    # 그 다음 원소 삭제하기
    que.append(que.popleft())

print(que[0])
