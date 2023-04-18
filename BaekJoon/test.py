text = input()
resText = []
tempText = []
text_list = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
count = 0

for i in text:
    if i not in text_list or count + 1 == len(text):
        if tempText != []:
            resText.append("".join(tempText))
            tempText = []
    else:
        tempText.append(i)

    count += 1

# 반복문 종료 후 tempText에 남아있는 단어들을 resText에 추가
if tempText != []:
    resText.append("".join(tempText))

# 입력 문자열의 마지막 문자가 공백이 아니면 단어로 처리
if text[-1] != ' ':
    resText.append("".join(text[-1]))

print(len(resText))
