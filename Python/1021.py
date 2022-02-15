num = float(input())+0.001
billetes = [100, 50, 20, 10, 5, 2]
monedas = [1, 0.50, 0.25, 0.10, 0.05, 0.01]

print("NOTAS:")
for i in billetes:
    print('%d nota(s) de R$ %.2f' % (num / i, i))
    num %= i
print("MOEDAS:")
for i in monedas:
    print('%d moeda(s) de R$ %.2f' % (num / i, i))
    num %= i
