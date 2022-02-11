line1 = input().split(" ")
line2 = input().split(" ")
print('VALOR A PAGAR: R$ %.2f' %
      (float(line1[1]) * float(line1[2]) + float(line2[1]) * float(line2[2])))