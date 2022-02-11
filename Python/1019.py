t = int(input())
hora = (t//3600)
min = (t % 3600) / 60
seg = t % 60
print('%d:%d:%d' % (hora, min, seg))
