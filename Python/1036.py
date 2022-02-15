import math
line1 = input().split(" ")
a = float(line1[0])
b = float(line1[1])
c = float(line1[2])

if ((b * b - 4 * a * c) < 0 or 2 * a == 0):
    print("Impossivel calcular")
else:
    print("R1 = %.5f" % ((-b + math.sqrt(b * b - 4 * a * c)) / (2 * a)))
    print("R2 = %.5f" % ((-b - math.sqrt(b * b - 4 * a * c)) / (2 * a)))
