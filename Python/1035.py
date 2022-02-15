line1 = input().split(" ")
a = int(line1[0])
b = int(line1[1])
c = int(line1[2])
d = int(line1[3])

if (b > c and d > a and c + d > a + b and c > 0 and d > 0 and a % 2 == 0):
    print("Valores aceitos")
else:
    print("Valores nao aceitos")
