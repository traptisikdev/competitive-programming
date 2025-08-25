percentage = int(input("Enter the percentage: "))
if percentage < 25:
    print("D")
elif percentage >= 25 and percentage < 45:
    print("C")
elif percentage >= 45 and percentage < 65:
    print("B")
elif percentage >= 25 and percentage < 45:
    print("C")
elif percentage >= 65 and percentage < 85:
    print("A")
else:
    print("A+")