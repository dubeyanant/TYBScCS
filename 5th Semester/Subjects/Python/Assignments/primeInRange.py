# To ask the user for a range and display all prime numbers in that range

lower = int(input("Enter low: "))
upper = int(input("Enter high: "))

print("Prime numbers between", lower, "and", upper, "are:")

for num in range(lower, upper + 1):
   # all prime numbers are greater than 1
   if num > 1:
       for i in range(2, num):
           if (num % i) == 0:
               break
       else:
           print(num)