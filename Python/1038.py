line1 = input().split(" ")
precios = [4.0, 4.50, 5.0, 2.0, 1.50]
product = int(line1[0])
qtd = int(line1[1])
print('Total: R$ %.2f' % (precios[product-1] * qtd))
