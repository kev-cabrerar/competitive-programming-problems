line1 = input().split(" ")
line1sort = str(sorted([int(i) for i in line1], reverse=True)[0])
print(line1sort + " eh o maior")
