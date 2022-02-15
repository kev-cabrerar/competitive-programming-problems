edad = int(input())
ano = edad // 365
mes = (edad % 365) // 30
dia = (edad % 365) % 30
print('%s ano(s)\n%s mes(es)\n%s dia(s)' % (ano, mes, dia))
