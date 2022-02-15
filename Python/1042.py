(num1, num2, num3) = map(int, input().split(" "))
line1_sorted = [num1, num2, num3]
line1_sorted.sort()
print("%d\n%d\n%d\n" % (line1_sorted[0], line1_sorted[1], line1_sorted[2]))
print("%d\n%d\n%d" % (num1, num2, num3))
