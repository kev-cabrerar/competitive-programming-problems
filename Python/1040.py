line1 = input().split(" ")
res = (float(line1[0]) * 2 + float(line1[1]) * 3 +
       float(line1[2]) * 4 + float(line1[3]) * 1) / 10
print('Media: %.1f' % res)
if (res >= 7):
    print("Aluno aprovado.")
elif (res >= 5 and res <= 6.9):
    print("Aluno em exame.")
    line2 = float(input())
    res = (res + line2) / 2
    print("Nota do exame: %.1f" % line2)
    if (res >= 5):
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print("Media final: %.1f" % res)
elif (res < 5):
    print("Aluno reprovado.")
