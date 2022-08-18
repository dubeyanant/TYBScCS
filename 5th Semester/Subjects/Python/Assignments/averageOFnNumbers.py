'''Average of n numbers'''

n = int(input("Enter the numbers of integers: "))

sum = 0

for i in range(n):
    x = int(input("Enter the numbers: "))
    sum = sum + x

avg = sum/n

print("Average of numbers = ", avg)