num = int(input())
billetes = [100, 50, 20, 10, 5, 2, 1]
print(num)
for i in billetes:
    print('%d nota(s) de R$ %d,00' % (num // i, i))
    num %= i
