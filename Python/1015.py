import math
line1 = input().split(" ")
line2 = input().split(" ")
x1, y1, x2, y2 = float(line1[0]), float(
    line1[1]), float(line2[0]), float(line2[1])
print('%.4f' % (math.sqrt((x2-x1)**2+(y2-y1)**2)))
