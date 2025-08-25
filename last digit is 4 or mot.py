number = int(input("Enter a number: "))

last_digit = abs(number) % 10

if last_digit == 4:
    print("The last digit is 4.")
else:
    print("The last digit is not 4.")