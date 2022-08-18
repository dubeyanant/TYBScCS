''' Swapping of 2 numbers'''

a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))

print("First number is: ", a)
print("Second number is: ", b)

(a, b) = (b, a)

print("First number after swapping is: ", a)
print("Second number after swapping is: ", b)