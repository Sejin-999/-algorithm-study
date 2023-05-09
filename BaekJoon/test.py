n =5 
s = []
for i in range(0,n):
    
    if len(s) == n :
        print(s)
    else:
        if n-len(s) %2 == 0 :
            s.append(00)
        else:
            s.append(1)