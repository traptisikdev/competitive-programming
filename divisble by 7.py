number = int(input("Enter a number: ")) 

if number % 7 == 0:
    print("The number is divisible by 7.")
else:
    print("The number is not divisible by 7.")

last_digit = abs(number) % 10
if last_digit == 5:
    print("The last digit is 5.")
else:
    print("The last digit is not 5.")