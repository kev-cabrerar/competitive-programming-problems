num = float(input())
porcentaje = 0.0

if (num >= 0 and num <= 400):
    porcentaje = 0.15

if (num > 400 and num <= 800):
    porcentaje = 0.12

if (num > 800 and num <= 1200):
    porcentaje = 0.1

if (num > 1200 and num <= 2000):
    porcentaje = 0.07

if (num > 2000):
    porcentaje = 0.04

salario = num * (porcentaje + 1)

print("Novo salario: %.2f" % salario)
print("Reajuste ganho: %.2f" % (salario - num))
print("Em percentual: %.0f %%" % (porcentaje * 100))
