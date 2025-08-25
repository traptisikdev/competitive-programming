a = int(input("Enter first angle: "))
b = int(input("Enter second angle: "))
c = int(input("Enter third angle: "))
if a + b + c == 180 and a > 0 and b > 0 and c > 0:
    if a == 90 or b == 90 or c == 90:
        print("Right triangle")
    elif a > 90 or b > 90 or c > 90:
        print("Obtuse triangle")
    else:
        print("Acute triangle")
else:
    print("Invalid triangle angles")