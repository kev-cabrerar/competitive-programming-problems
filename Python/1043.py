(a, b, c) = map(float, input().split(" "))
if(a < (b + c) and b < (c + a) and c < (a + b)):
    print("Perimetro = %.1f" % (a + b + c))
else:
    print("Area = %.1f" % (((a + b) * c) / 2))
