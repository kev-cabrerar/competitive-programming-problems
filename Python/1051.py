salario = float(input())

if(salario >= 0 and salario <= 2000):
    print("Isento")

elif(salario > 2000 and salario <= 3000):
    print("R$ %.2f" % ((salario - 2000.0) * 0.08))

elif(salario > 3000 and salario <= 4500):
    print("R$ %.2f" % ((((salario - 2000.0)-(salario - 3000.0))
          * 0.08) + (salario - 3000.0) * 0.18))

elif(salario > 4500):
    print("R$ %.2f" % ((((salario - 2000.0)-(salario - 3000.0))
          * 0.08) + (((salario - 3000.0) - (salario - 4500.0)) * 0.18)+((salario - 4500.0) * 0.28)))