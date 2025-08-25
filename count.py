n = int(input("enter the number"))
digit = 0
while (n>0):
    n = n//10
    digit = digit+1
print(digit)


num = int(input("Enter a number: "))
total = 0

while num > 0:
    digit = num % 10       
    total += digit         
    num //= 10             

print("Sum of digits:", total)
