(a, b, c) = map(float, input().split(" "))
line1_sorted = [a, b, c]
line1_sorted.sort(reverse=True)
(a, b, c) = line1_sorted

if(a >= b + c):
    print("NAO FORMA TRIANGULO")
elif(a**2 == b**2 + c**2):
    print("TRIANGULO RETANGULO")
elif(a**2 > b**2 + c**2):
    print("TRIANGULO OBTUSANGULO")
elif(a**2 < b**2 + c**2):
    print("TRIANGULO ACUTANGULO")
if(a == b == c):
    print("TRIANGULO EQUILATERO")
elif(a == b != c or a != b == c or a == c != b):
    print("TRIANGULO ISOSCELES")
